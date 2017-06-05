package code.generation;

public class Assert extends Code {
    private final String expression;
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
