package code;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProgramBuilder {
    private final ArrayList<Code> codeArrayList = new ArrayList<>();
    private final LinkedList<Variable> variables = new LinkedList<>();
    private final ArrayList<MaxAbsError> absErrors = new ArrayList<>();
    private static final String[] libraries = {"assert.h", "stdlib.h"};
    static final String FIFO_NAME = "fifo";

    private void next() {
        if (variables.peek().hasNext())
            variables.peek().next();
        else if (!variables.isEmpty())
            variables.poll().next();
    }

    public void run() throws IOException, InterruptedException {
        File fifoFile = new File(FIFO_NAME);
        fifoFile.createNewFile();
        RandomAccessFile fifo = new RandomAccessFile(fifoFile, "r");

        System.out.println(toString());
        CompletableFuture<Void> wait = new CompletableFuture<>();

        new Thread(() -> {
            int var;
            int varIndex = 0;
            try {
                while (true) {
                    var = fifo.readInt();
                    absErrors.get(varIndex).setReferenceValue(var);
                }
            } catch (EOFException ignored) {
                wait.complete(null);
            } catch (IOException e) {
                try {
                    fifo.close();
                } catch (IOException ignored) {
                }

                wait.completeExceptionally(e);
            }
        }).start();

        try {
            wait.get();
        } catch (ExecutionException e) {
            fifoFile.delete();
            return;
        }

        while (hasNext()) {
            next();
            System.out.println(toString());
        }
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
