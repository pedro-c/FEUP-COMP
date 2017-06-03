public class StaticCode extends Code {
    private String code;

    StaticCode(String code) {
        super();
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
