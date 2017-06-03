import java.util.ArrayList;
import java.util.LinkedList;

public class ProgramBuilder {
    private ArrayList<Code> codeArrayList = new ArrayList<>();
    private LinkedList<Variable> variables = new LinkedList<>();

    void next() {
        if (variables.peek().hasNext())
            variables.peek().next();
        else if (!variables.isEmpty())
            variables.poll().next();
    }

    boolean hasNext() {
        return !variables.isEmpty();
    }

    void append(Code code) {
        codeArrayList.add(code);
    }

    void addVariable(Variable variable) {
        variables.add(variable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Code code : codeArrayList) {
            sb.append(code.toString());
            sb.append(" ");
        }

        return sb.toString();
    }
}
