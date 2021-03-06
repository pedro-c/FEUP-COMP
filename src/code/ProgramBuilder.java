package code;

import code.generation.Assert;
import code.generation.Code;
import code.generation.MaxAbsError;
import code.generation.Variable;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;

public class ProgramBuilder {
    private static final int MAX_ITERATIONS = 500;
    private final ArrayList<Code> codeArrayList = new ArrayList<>();
    private final LinkedList<Variable> variableQueue = new LinkedList<>();
    private final ArrayList<Variable> variables = new ArrayList<>();
    private final ArrayList<MaxAbsError> absErrors = new ArrayList<>();
    private static final String[] libraries = {"assert.h", "stdlib.h", "sys/types.h", "sys/stat.h", "fcntl.h", "unistd.h"};
    public static final String FIFO_NAME = "fifo";
    public static final String FILE_NAME = "autotuner";

    private Variable next() {
        Variable var = variableQueue.peek();

        if (var.hasNext()) {
            var.next();
        } else if (!variableQueue.isEmpty()) {
            variableQueue.poll().next();
            var = variableQueue.peek();
            if (var != null)
                var.next();
        } else
            var = null;

        return var;
    }

    private void runReference(File fifoFile, CompletableFuture<Void> wait) {
        System.out.println("Running reference...");
        final RandomAccessFile fifo;
        try {
            fifo = new RandomAccessFile(fifoFile, "r");
            ProgramRunner.compile(toString(), FILE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            wait.completeExceptionally(e);
            return;
        }

        new Thread(() -> {
            try {
                ProgramRunner.run(FILE_NAME);
                wait.complete(null);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                wait.completeExceptionally(e);
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }

        int var;
        int varIndex = 0;
        try {
            while (true) {
                var = Integer.reverseBytes(fifo.readInt());
                absErrors.get(varIndex).setReferenceValue(var);
            }
        } catch (IOException ignored) {
            /* When the FIFO has no more info to send. */
        }

        try {
            fifo.close();
        } catch (IOException e) {
            e.printStackTrace();
            wait.completeExceptionally(e);
        }
    }

    public void run() throws Exception {
        File fifoFile = new File(FIFO_NAME);
        fifoFile.createNewFile();

        CompletableFuture<Void> wait = new CompletableFuture<>();
        runReference(fifoFile, wait);
        wait.get();
        fifoFile.delete();

        Variable curVar = next();

        System.out.println("Starting benchmarks...");
        Assert.isBenchmark = true;
        do {
            try {
                curVar.updateBestBenchmark(runIteration());
            } catch (AssertionError ignored) {
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(2);
            }

            curVar = next();
        } while (hasNext());

        for (Variable variable : variables) {
            if (variable.getBestAvg() == Double.MAX_VALUE)
                throw new Exception("Variable " + variable.getName() + " never fulfills the pragma condition.");
        }

        ProgramRunner.clean();
    }

    private double runIteration() throws Exception {
        ProgramRunner.compile(toString(), FILE_NAME);

        double avg = 0;
        for (int i = 0; i < MAX_ITERATIONS; i++)
            avg += ProgramRunner.runAndBenchmark(FILE_NAME);

        return avg / MAX_ITERATIONS;
    }

    private boolean hasNext() {
        return !variableQueue.isEmpty();
    }

    public void append(Code code) {
        codeArrayList.add(code);
    }

    public void addVariable(Variable variable) {
        variableQueue.add(variable);
        variables.add(variable);
    }

    public void addMaxAbsError(MaxAbsError maxAbsError) {
        absErrors.add(maxAbsError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (String library : libraries) {
            sb.append("#include \"");
            sb.append(library);
            sb.append("\"\n");
        }

        for (Code code : codeArrayList) {
            sb.append(code.toString());
            sb.append(" ");
        }

        return sb.toString();
    }

    public void printBestInformation() {
        for (Variable var : variables)
            System.out.println("Name: " + var.getName() + "\tValue: " + var.getBestValue() + "\tAverage: " + var.getBestAvg() + "ns");
    }

    public String getBestCode() {
        for (Variable var : variables)
            var.setBestValue();

        Assert.isBenchmark = false;

        StringBuilder sb = new StringBuilder();
        for (Code code : codeArrayList) {
            sb.append(code.toString());
            sb.append(" ");
        }

        return sb.toString();
    }
}
