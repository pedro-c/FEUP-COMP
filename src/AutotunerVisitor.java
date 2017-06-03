import gen.AutotunerParser;
import gen.AutotunerParserBaseVisitor;
import sun.misc.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AutotunerVisitor<T> extends AutotunerParserBaseVisitor<T> {
    private HashMap<String, ExploreInfo> exploreHashMap = new HashMap<>();

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

    public void printExploreHashMap(){
        for (HashMap.Entry<String, ExploreInfo> entry : exploreHashMap.entrySet()) {

            System.out.println("VAR: " + entry.getKey());
            System.out.println("VAL: " + entry.getValue());

        }
    }

    public HashMap<String, ExploreInfo> getExploreMap(){
        return exploreHashMap;
    }

    /* public void iterateExplore() throws FileNotFoundException {

        String content = new Scanner(new File("test/explore.c")).useDelimiter("\\Z").next();
        System.out.println(content);

        for (HashMap.Entry<String, ExploreInfo> entry : exploreHashMap.entrySet()) {

            double step = entry.getValue().getReference();
            double value = entry.getValue().getMin();
            double max = entry.getValue().getMax();
            String tempCode = content;

            for(int i = value; value < max; value += step){
                tempCode.replace(entry.getKey(), entry.getValue());
            }


        }
    } */
}
