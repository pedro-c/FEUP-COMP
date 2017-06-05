package code.generation;

public class StaticCode extends Code {
    private final String code;

    public StaticCode(String code) {
        super();
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
