import gen.AutotunerParser;
import gen.AutotunerParserBaseVisitor;

import java.util.HashMap;

public class AutotunerVisitor<T> extends AutotunerParserBaseVisitor<T> {
    HashMap<String, ExploreInfo> exploreHashMap = new HashMap<>();

    @Override
    public T visitPragma(AutotunerParser.PragmaContext ctx) {
        System.out.println("Entered pragma!");
        return visitChildren(ctx);
    }

    @Override
    public T visitExplore(AutotunerParser.ExploreContext ctx) {
        System.out.println(ctx.toString());
        String variable = ctx.IDENTIFIER(0).getText();
        String secondVariable = ctx.IDENTIFIER(1).getText();

        double min = Double.parseDouble(ctx.MIN.getText());
        double max = Double.parseDouble(ctx.MAX.getText());
        double reference = Double.parseDouble(ctx.REF.getText());

        if (!variable.equals(secondVariable))
            System.err.println("Explore cannot have two different variables in its declaration.");
        else
            exploreHashMap.put(variable, new ExploreInfo(reference, min, max));

        return visitChildren(ctx);
    }

    @Override
    public T visitMax_abs_error(AutotunerParser.Max_abs_errorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitVariable(AutotunerParser.VariableContext ctx) {
        System.out.println(ctx.getText() + ": " + exploreHashMap.get(ctx.getText()));

        return visitChildren(ctx);
    }
}
