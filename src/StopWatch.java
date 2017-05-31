public class StopWatch {
    private long start = 0;

    void start() {
        start = System.currentTimeMillis();
    }

    long stop() {
        return System.currentTimeMillis() - start;
    }
}
