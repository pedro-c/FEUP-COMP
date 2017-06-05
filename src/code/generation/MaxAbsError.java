package code.generation;

import code.ProgramBuilder;

public class MaxAbsError extends Code {
    private final String variable;
    private final int error;
    private Integer referenceValue = null;
    private Assert assertion;

    public MaxAbsError(String variable, int error) {
        this.variable = variable;
        this.error = error;
    }

    public void setReferenceValue(int referenceValue) {
        this.referenceValue = referenceValue;
        assertion = new Assert("abs(" + variable + " - " + referenceValue + ") <= " + error);
        System.out.println("Reference Value for " + variable + ": " + referenceValue);
    }

    @Override
    public String toString() {
        if (referenceValue != null)
            return assertion.toString();
        else
            return getVariableValue();
    }

    private String getVariableValue() {
        return "int fd = open(\"" + ProgramBuilder.FIFO_NAME + "\", O_WRONLY);\n" +
                "write(fd, &" + variable + ", sizeof(" + variable + "));\n" +
                "close(fd);\n";
    }
}
