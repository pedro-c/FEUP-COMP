import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Autotuner {
    public static void main(String[] args) {
        String filePath = "test.c";

        ANTLRFileStream fileStream = null;
        try {
            fileStream = new ANTLRFileStream(filePath);
        } catch (IOException e) {
            System.err.println("Error opening file at: " + filePath);
            e.printStackTrace();
        }

        AutotunerLexer autotunerLexer = new AutotunerLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(autotunerLexer);
        AutotunerParser autotunerParser = new AutotunerParser(tokenStream);
        ParseTree parseTree = autotunerParser.start();

        AutotunerBaseListener listener = new AutotunerBaseListener();
        ParseTreeWalker.DEFAULT.walk(listener, parseTree);
    }
}
