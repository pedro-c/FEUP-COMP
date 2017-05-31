import gen.AutotunerParser;
import gen.AutotunerParserBaseVisitor;
import javafx.util.Pair;

public class AutotunerVisitor<T> extends AutotunerParserBaseVisitor<T> {

    Pair<String, Double> references;
    String exploreVariable;

    @Override
    public T visitExplore(AutotunerParser.ExploreContext ctx) {
        references = new Pair<>(ctx.VARIABLE().getText(), Double.parseDouble(ctx.NUMBER(2).getText()));
        exploreVariable = ctx.VARIABLE().getText();
        return visitChildren(ctx);
    }

    @Override
    public T visitMax_abs_error(AutotunerParser.Max_abs_errorContext ctx) {
        Condition condition = new MaxAbsError(references.getValue(), Double.parseDouble(ctx.NUMBER().getText()));

        return visitChildren(ctx);
    }
}
