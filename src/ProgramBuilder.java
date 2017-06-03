import code.Code;
import code.Variable;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProgramBuilder {
    private final ArrayList<Code> codeArrayList = new ArrayList<>();
    private final LinkedList<Variable> variables = new LinkedList<>();
    private static final String[] libraries = {"assert.h"};

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

        for (String library : libraries) {
            sb.append("#include \"");
            sb.append(library);
            sb.append("\"\n");
        }

        for (Code code : codeArrayList) {
            sb.append(code.toString());
            sb.append(" ");
        }

        return sb.toString();
    }
}
