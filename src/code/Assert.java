package code;

public class Assert extends Code {
    private String expression;
    public static boolean isBenchmark = true;

    public Assert(String expression) {
        super();
        this.expression = expression;
    }

    @Override
    public String toString() {
        return isBenchmark ? "assert(" + expression + ");" : "";
    }
}
