import code.*;
import gen.AutotunerParser;
import gen.AutotunerParserBaseVisitor;

import java.util.HashMap;

public class AutotunerVisitor<T> extends AutotunerParserBaseVisitor<T> {
    private HashMap<String, Variable> variablesHashMap = new HashMap<>();
    private ProgramBuilder programBuilder;

    AutotunerVisitor(ProgramBuilder programBuilder) {
        super();
        this.programBuilder = programBuilder;
    }

    @Override
    public T visitExplore(AutotunerParser.ExploreContext ctx) {
        String varName = ctx.IDENTIFIER(0).getText();
        String secondVarName = ctx.IDENTIFIER(1).getText();

        int min = Integer.parseInt(ctx.MIN.getText());
        int max = Integer.parseInt(ctx.MAX.getText());
        int reference = Integer.parseInt(ctx.REF.getText());

        if (!varName.equals(secondVarName)) {
            try {
                throw new Exception("Explore cannot have two different variables in its declaration.");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }

        } else if (min >= max) {
            try {
                throw new Exception("Explore minimum must be lower than maximum.");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        } else {
            Variable variable = new Variable(varName, reference, min, max);
            variablesHashMap.put(varName, variable);
            programBuilder.addVariable(variable);
        }

        return visitChildren(ctx);
    }

    @Override
    public T visitMax_abs_error(AutotunerParser.Max_abs_errorContext ctx) {
        MaxAbsError maxAbsError = new MaxAbsError(ctx.IDENTIFIER().getText(), Integer.parseInt(ctx.NUMBER().getText()));
        programBuilder.addMaxAbsError(maxAbsError);
        programBuilder.append(maxAbsError);
        return visitChildren(ctx);
    }

    @Override
    public T visitVariable(AutotunerParser.VariableContext ctx) {
        String variableName = ctx.getText();
        Variable variable = variablesHashMap.get(variableName);

        if (variable != null)
            programBuilder.append(variable);
        else
            programBuilder.append(new StaticCode(variableName));

        return visitChildren(ctx);
    }

    @Override
    public T visitIgnore(AutotunerParser.IgnoreContext ctx) {
        programBuilder.append(new StaticCode(ctx.getText()));
        return visitChildren(ctx);
    }

    @Override
    public T visitKeyword(AutotunerParser.KeywordContext ctx) {
        programBuilder.append(new StaticCode(ctx.getText()));
        return visitChildren(ctx);
    }

    @Override
    public T visitIs_even(AutotunerParser.Is_evenContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        programBuilder.append(new Assert(variable + " % 2 == 0"));

        return visitChildren(ctx);
    }

    @Override
    public T visitIs_odd(AutotunerParser.Is_oddContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        programBuilder.append(new Assert(variable + " % 2 == 1"));

        return visitChildren(ctx);
    }

    @Override
    public T visitIs_positive(AutotunerParser.Is_positiveContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        programBuilder.append(new Assert(variable + " > 0"));

        return visitChildren(ctx);
    }

    @Override
    public T visitIs_negative(AutotunerParser.Is_negativeContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        programBuilder.append(new Assert(variable + " < 0"));

        return visitChildren(ctx);
    }

    @Override
    public T visitInclude(AutotunerParser.IncludeContext ctx) {
        programBuilder.append(new StaticCode(ctx.getText() + "\n"));
        return visitChildren(ctx);
    }
}
