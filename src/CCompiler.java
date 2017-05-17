import java.io.IOException;

public class CCompiler {
    private static final String C_COMPILER = "gcc";

    public static void compile(String filename, String outname) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder(C_COMPILER, "-o", outname);
        processBuilder.inheritIO();
        processBuilder.start();
    }

    public static long runAndBenchmark(String programName) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("./" + programName);
        processBuilder.inheritIO();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        processBuilder.start();

        return stopWatch.stop();
    }
}
