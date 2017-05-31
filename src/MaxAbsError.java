public class MaxAbsError extends Condition {

    private double maxAbsError;

    MaxAbsError(double refValue, double maxAbsError) {
        super(refValue);
        this.maxAbsError = maxAbsError;
    }

    public boolean fitsCondition(double currentValue) {
        return Math.abs(refValue - currentValue) < maxAbsError;
    }
}
