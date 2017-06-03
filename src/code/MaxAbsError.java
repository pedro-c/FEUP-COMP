package code;

public class MaxAbsError extends Code {
    private final String variable;
    private final int error;
    private Integer referenceValue = null;

    public MaxAbsError(String variable, int error) {
        this.variable = variable;
        this.error = error;
    }

    void setReferenceValue(int referenceValue) {
        this.referenceValue = referenceValue;
    }

    @Override
    public String toString() {
        if (referenceValue != null)
            return "assert(abs(" + variable + " - " + referenceValue + ") <= " + error + ");";
        else
            return getVariableValue();
    }

    private String getVariableValue() {
        return "int fd = open(" + ProgramBuilder.FIFO_NAME + ", O_WRONLY);\n" +
                "write(fd, &" + variable + ", sizeof(variable));\n" +
                "close(fd);\n";
    }
}
