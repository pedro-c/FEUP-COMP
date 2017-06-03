public class Variable extends Code {
    private String name;
    private int min;
    private int max;
    private int reference;
    private int currentValue;

    Variable(String name, int reference, int min, int max) {
        this.name = name;
        this.reference = reference;
        this.min = min;
        this.max = max;
        currentValue = this.min - 1;
    }

    @Override
    public String toString() {
        if (currentValue < min || currentValue > max)
            return Integer.toString(reference);
        else
            return Integer.toString(currentValue);
    }

    boolean hasNext() {
        return currentValue < max;
    }

    void next() {
        currentValue++;
    }
}
