import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CCompiler {
    private static final String C_COMPILER = "gcc";

    public static void compile(String code, String fileName) throws IOException {

        try(  PrintWriter out = new PrintWriter( fileName + ".c" )  ){
            out.println(code);
        }

        ProcessBuilder processBuilder = new ProcessBuilder( "gcc", fileName+ ".c", "-o", fileName);
        try {
            processBuilder.start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static double runAndBenchmark(String programName) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("./" + programName);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        try {
            processBuilder.start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return stopWatch.stop();
    }

}
