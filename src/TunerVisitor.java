/**
 * Created by bernardo on 3/30/17.
 */
public class TunerVisitor extends AutotunerBaseVisitor<Boolean> {
    @Override
    public Boolean visitStart(AutotunerParser.StartContext ctx) {
        return true;
    }
}
