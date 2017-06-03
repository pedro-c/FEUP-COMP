import gen.AutotunerLexer;
import gen.AutotunerParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import sun.awt.image.ImageWatched;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String... args) throws IOException {
        AutotunerLexer lexer = new AutotunerLexer(CharStreams.fromFileName("test/explore.c"));
        AutotunerParser parser = new AutotunerParser(new CommonTokenStream(lexer));
        HashMap<String,LinkedList<Double>> results = new HashMap<>();

        ProgramBuilder programBuilder = new ProgramBuilder();
        AutotunerVisitor autotunerVisitor = new AutotunerVisitor<>(programBuilder);
        autotunerVisitor.visit(parser.main());

            int fileName = 0;
            while (programBuilder.hasNext()) {

                programBuilder.next();

                CCompiler.compile(programBuilder.toString(), Integer.toString(fileName));
                for (int j = 0; j < 2000; j++) {
                    Double time = CCompiler.runAndBenchmark(Integer.toString(fileName));

                    if (results.get(Integer.toString(fileName)) == null) {
                        LinkedList<Double> avg = new LinkedList<>();
                        avg.push(time);
                        results.put(Integer.toString(fileName), avg);
                    } else {
                        LinkedList<Double> avg = results.get(Integer.toString(fileName));
                        avg.push(time);
                        results.put(Integer.toString(fileName), avg);
                    }
                }

                fileName++;
            }


        for(HashMap.Entry<String,LinkedList<Double>> avg : results.entrySet()){

            double average = 0;
            ListIterator<Double> it = avg.getValue().listIterator(avg.getValue().size());
            while (it.hasPrevious())
            {
                double sum = it.previous();
                average += sum/results.size();
            }

            System.out.println(average/2000);
        }
    }
}
