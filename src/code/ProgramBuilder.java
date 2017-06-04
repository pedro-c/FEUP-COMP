package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ProgramBuilder {
    private static final int MAX_ITERATIONS = 500;
    private final ArrayList<Code> codeArrayList = new ArrayList<>();
    private final LinkedList<Variable> variables = new LinkedList<>();
    private final ArrayList<MaxAbsError> absErrors = new ArrayList<>();
    private static final String[] libraries = {"assert.h", "stdlib.h", "sys/types.h", "sys/stat.h", "fcntl.h", "unistd.h", "stdio.h"};
    static final String FIFO_NAME = "fifo";
    private static final String FILE_NAME = "autotuner";

    private void next() {
        if (variables.peek().hasNext())
            variables.peek().next();
        else if (!variables.isEmpty())
            variables.poll().next();
    }

    private void runReference(File fifoFile, CompletableFuture<Void> wait) {
        final RandomAccessFile fifo;
        try {
            fifo = new RandomAccessFile(fifoFile, "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            wait.completeExceptionally(e);
            return;
        }

        try {
            ProgramRunner.compile(toString(), FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
            wait.completeExceptionally(e);
            return;
        }

        new Thread(() -> {
            try {
                ProgramRunner.run(FILE_NAME);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                wait.completeExceptionally(e);
            }
        }).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int var;
        int varIndex = 0;
        try {
            while (true) {
                var = fifo.readInt();
                absErrors.get(varIndex).setReferenceValue(var);
            }
        } catch (IOException ignored) {
            ignored.printStackTrace();
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
        Executors.newSingleThreadExecutor().submit(() -> runReference(fifoFile, wait));
        wait.get();
        fifoFile.delete();

        /*while (hasNext()) {
            next();
            runIteration();
        }*/
    }

    private void runIteration() throws IOException, InterruptedException {
        ProgramRunner.compile(toString(), FILE_NAME);

        int avg = 0;
        for (int i = 0; i < MAX_ITERATIONS; i++)
            avg += ProgramRunner.runAndBenchmark(FILE_NAME);

        avg /= MAX_ITERATIONS;
        System.out.println("Avg for iteration: " + avg);
    }

    private boolean hasNext() {
        return !variables.isEmpty();
    }

    public void append(Code code) {
        codeArrayList.add(code);
    }

    public void addVariable(Variable variable) {
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
}
