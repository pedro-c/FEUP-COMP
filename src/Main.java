import gen.AutotunerLexer;
import gen.AutotunerParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {
        AutotunerLexer lexer = new AutotunerLexer(CharStreams.fromFileName("test/test2.c"));
        AutotunerParser parser = new AutotunerParser(new CommonTokenStream(lexer));

        ProgramBuilder programBuilder = new ProgramBuilder();
        AutotunerVisitor autotunerVisitor = new AutotunerVisitor<>(programBuilder);
        autotunerVisitor.visit(parser.main());

        //Reference
        System.out.println(programBuilder.toString());

        while (programBuilder.hasNext()) {
            programBuilder.next();
            System.out.println(programBuilder.toString());
        }
    }
}
