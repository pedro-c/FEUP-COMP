public class ExploreInfo {
    private final double reference;
    private final double min;
    private final double max;

    ExploreInfo(double reference, double min, double max) {
        this.reference = reference;
        this.min = min;
        this.max = max;
    }

    public double getReference() {
        return reference;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
