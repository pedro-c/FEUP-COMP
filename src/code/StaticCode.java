package code;

public class StaticCode extends Code {
    private String code;

    public StaticCode(String code) {
        super();
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
