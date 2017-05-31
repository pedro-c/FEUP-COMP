public abstract class Condition {
    protected double refValue;

    Condition(double refValue) {
        this.refValue = refValue;
    }

    public abstract boolean fitsCondition(double currentValue);
}
