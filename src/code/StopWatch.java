package code;

public class StopWatch {
    private double start = 0;

    void start() {
        start = System.currentTimeMillis();
    }

    double stop() {
        return System.currentTimeMillis() - start;
    }
}
