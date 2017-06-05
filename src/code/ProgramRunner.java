package code;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static code.ProgramBuilder.FILE_NAME;

class ProgramRunner {
    private static final String C_COMPILER = "gcc";

    static void compile(String code, String fileName) throws Exception {
        try (PrintWriter out = new PrintWriter(fileName + ".c")) {
            out.println(code);
        }

        ProcessBuilder processBuilder = new ProcessBuilder(C_COMPILER, fileName + ".c", "-o", fileName);
        try {
            if (processBuilder.start().waitFor() != 0)
                throw new Exception("Invalid C code. Compilation failed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static int run(String programName) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("./" + programName);
        return processBuilder.start().waitFor();
    }

    static double runAndBenchmark(String programName) throws IOException, InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        if (run(programName) != 0)
            throw new AssertionError();


        return stopWatch.stop();
    }

    static void clean() {
        File file = new File(FILE_NAME);
        file.delete();
    }
}
