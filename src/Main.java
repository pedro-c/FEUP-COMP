import code.ProgramBuilder;
import gen.AutotunerLexer;
import gen.AutotunerParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

import static code.ProgramBuilder.FILE_NAME;

class Main {

    public static void main(String... args) throws IOException, InterruptedException, ExecutionException {
        if (args.length != 1) {
            System.err.println("Autotuner needs one argument to execute.\nIt is the path to the file that contains the code to optimize.");
            return;
        }

        AutotunerLexer lexer = new AutotunerLexer(CharStreams.fromFileName(args[0]));
        AutotunerParser parser = new AutotunerParser(new CommonTokenStream(lexer));
        parser.setErrorHandler(new BailErrorStrategy());

        ProgramBuilder programBuilder = new ProgramBuilder();
        AutotunerVisitor autotunerVisitor = new AutotunerVisitor<>(programBuilder);
        try {
            autotunerVisitor.visit(parser.main());
        } catch (ParseCancellationException e) {
            System.err.println("Found syntax errors in input. Aborting..");
            System.exit(3);
        }

        programBuilder.run();
        programBuilder.printBestInformation();

        System.out.println("Best code stored on file " + FILE_NAME + ".c");

        File output = new File(FILE_NAME + ".c");
        PrintWriter writer = new PrintWriter(output);
        writer.print(programBuilder.getBestCode());
        writer.close();
    }
}
