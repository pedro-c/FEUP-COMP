import gen.AutotunerParser;
import gen.AutotunerParserBaseVisitor;

public class AutotunerVisitor<T> extends AutotunerParserBaseVisitor<T> {


    @Override
    public T visitExplore(AutotunerParser.ExploreContext ctx) {
        System.out.println(ctx.NUMBER());
        return visitChildren(ctx);
    }

}
