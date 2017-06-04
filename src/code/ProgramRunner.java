package code;

import java.io.IOException;
import java.io.PrintWriter;

public class ProgramRunner {
    private static final String C_COMPILER = "gcc";

    public static void compile(String code, String fileName) throws IOException {

        try (PrintWriter out = new PrintWriter(fileName + ".c")) {
            out.println(code);
        }

        ProcessBuilder processBuilder = new ProcessBuilder(C_COMPILER, fileName + ".c", "-o", fileName);
        processBuilder.inheritIO();
        try {
            processBuilder.start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void run(String programName) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("./" + programName);
        processBuilder.start().waitFor();
    }

    public static double runAndBenchmark(String programName) throws IOException, InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        run(programName);

        return stopWatch.stop();
    }

}
