import code.ProgramBuilder;
import gen.AutotunerLexer;
import gen.AutotunerParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String... args) throws IOException, InterruptedException, ExecutionException {
        AutotunerLexer lexer = new AutotunerLexer(CharStreams.fromFileName("test/test2.c"));
        AutotunerParser parser = new AutotunerParser(new CommonTokenStream(lexer));

        ProgramBuilder programBuilder = new ProgramBuilder();
        AutotunerVisitor autotunerVisitor = new AutotunerVisitor<>(programBuilder);
        autotunerVisitor.visit(parser.main());

        programBuilder.run();
        programBuilder.printBestInformation();
    }
}
