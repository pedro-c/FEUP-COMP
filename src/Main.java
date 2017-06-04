import code.ProgramBuilder;
import gen.AutotunerLexer;
import gen.AutotunerParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

import static code.ProgramBuilder.FILE_NAME;

public class Main {

    public static void main(String... args) throws IOException, InterruptedException, ExecutionException {
        AutotunerLexer lexer = new AutotunerLexer(CharStreams.fromFileName(args[0]));
        AutotunerParser parser = new AutotunerParser(new CommonTokenStream(lexer));

        ProgramBuilder programBuilder = new ProgramBuilder();
        AutotunerVisitor autotunerVisitor = new AutotunerVisitor<>(programBuilder);
        autotunerVisitor.visit(parser.main());

        programBuilder.run();
        programBuilder.printBestInformation();

        System.out.println("Best code stored on file " + FILE_NAME + ".c");

        File output = new File(FILE_NAME + ".c");
        PrintWriter writer = new PrintWriter(output);
        writer.print(programBuilder.getBestCode());
        writer.close();
    }
}
