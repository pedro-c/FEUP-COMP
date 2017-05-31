import gen.AutotunerParser;
import gen.AutotunerParserBaseVisitor;

import java.util.HashMap;

public class AutotunerVisitor<T> extends AutotunerParserBaseVisitor<T> {
    HashMap<String, ExploreInfo> exploreHashMap = new HashMap<String, ExploreInfo>();

    @Override
    public T visitPragma(AutotunerParser.PragmaContext ctx) {
        System.out.println("Entered pragma!");
        return visitChildren(ctx);
    }

    @Override
    public T visitExplore(AutotunerParser.ExploreContext ctx) {
        String variable = ctx.VARIABLE(0).getText();
        String secondVariable = ctx.VARIABLE(1).getText();

        double min = Double.parseDouble(ctx.NUMBER(0).getText());
        double max = Double.parseDouble(ctx.NUMBER(1).getText());
        double reference = Double.parseDouble(ctx.NUMBER(2).getText());

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

    public T visitType(AutotunerParser.TypeContext ctx) {
        ctx.TYPE().forEach(System.out::print);
        return visitChildren(ctx);
    }

    @Override
    public T visitStart(AutotunerParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitVariable(AutotunerParser.VariableContext ctx) {
        System.out.println(exploreHashMap.get(ctx.getText()));

        return visitChildren(ctx);
    }
}
