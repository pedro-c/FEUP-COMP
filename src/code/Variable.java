package code;

public class Variable extends Code {
    private final String name;
    private int min;
    private int max;
    private int reference;
    private int currentValue;
    private int bestValue;
    private double bestAvg;

    public Variable(String name, int reference, int min, int max) {
        this.name = name;
        this.reference = reference;
        this.min = min;
        this.max = max;
        this.bestValue = reference;
        this.bestAvg = Double.MAX_VALUE;
        currentValue = this.min - 1;
    }

    @Override
    public String toString() {
        if (currentValue < min || currentValue > max)
            return Integer.toString(reference);
        else
            return Integer.toString(currentValue);
    }

    public void updateBestBenchmark(double bestAvg) {
        if (bestAvg < this.bestAvg) {
            this.bestAvg = bestAvg;
            this.bestValue = currentValue;
        }
    }


    public boolean hasNext() {
        return currentValue < max;
    }

    public void next() {
        currentValue++;
    }

    public double getBestAvg() {
        return bestAvg;
    }

    public int getBestValue() {
        return bestValue;
    }

    public String getName() {
        return name;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
