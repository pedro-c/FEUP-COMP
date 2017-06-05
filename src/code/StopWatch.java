package code;

class StopWatch {
    private double start = 0;

    void start() {
        start = System.nanoTime();
    }

    double stop() {
        return System.nanoTime() - start;
    }
}
