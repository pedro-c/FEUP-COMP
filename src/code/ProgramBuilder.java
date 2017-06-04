package code;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProgramBuilder {
    private static final int MAX_ITERATIONS = 200;
    private final ArrayList<Code> codeArrayList = new ArrayList<>();
    private final LinkedList<Variable> variables = new LinkedList<>();
    private final ArrayList<Variable> bestVariables = new ArrayList<>();
    private final ArrayList<MaxAbsError> absErrors = new ArrayList<>();
    private static final String[] libraries = {"assert.h", "stdlib.h", "sys/types.h", "sys/stat.h", "fcntl.h", "unistd.h"};
    static final String FIFO_NAME = "fifo";
    private static final String FILE_NAME = "autotuner";

    private Variable next() {
        Variable var = variables.peek();

        if (var.hasNext()) {
            var.next();
        } else if (!variables.isEmpty()) {
            var.next();
            variables.poll();
        } else
            var = null;

        return var;
    }

    private void runReference(File fifoFile, CompletableFuture<Void> wait) {
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
            Thread.sleep(2000); //FIXME:
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

    public void run() throws IOException, InterruptedException, ExecutionException {
        File fifoFile = new File(FIFO_NAME);
        fifoFile.createNewFile();

        CompletableFuture<Void> wait = new CompletableFuture<>();
        runReference(fifoFile, wait);
        wait.get();
        fifoFile.delete();

        while (hasNext()) {
            Variable curVar = next();

            try {
                curVar.updateBestBenchmark(runIteration());
            } catch (AssertionError ignored) {
            }
        }
    }

    private double runIteration() throws IOException, InterruptedException {
        ProgramRunner.compile(toString(), FILE_NAME);

        double avg = 0;
        for (int i = 0; i < MAX_ITERATIONS; i++)
            avg += ProgramRunner.runAndBenchmark(FILE_NAME);

        return avg / MAX_ITERATIONS;
    }

    private boolean hasNext() {
        return !variables.isEmpty();
    }

    public void append(Code code) {
        codeArrayList.add(code);
    }

    public void addVariable(Variable variable) {
        variables.add(variable);
        bestVariables.add(variable);
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
        for (Variable var : bestVariables) {
            System.out.println(var.getName() + ": " + var.getBestValue() + "\t" + var.getBestAvg());

        }
    }
}
