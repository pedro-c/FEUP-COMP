import gen.AutotunerLexer;
import gen.AutotunerParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String... args) throws IOException {
        AutotunerLexer lexer = new AutotunerLexer(CharStreams.fromFileName("test/explore.c"));
        AutotunerParser parser = new AutotunerParser(new CommonTokenStream(lexer));

        AutotunerVisitor autotunerVisitor = new AutotunerVisitor<>();
        autotunerVisitor.visit(parser.start());
    }
}
