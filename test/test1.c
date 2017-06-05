int main() {
    int N = 1024;
    int buf[N];
    int acc = 0;

    for(int i = 0; i < N; i++) {
        buf[i] = i;
    }

    #pragma tuner explore STEP(1, 10) reference(STEP=1)
    for (int i = 0; i < N; i += STEP) {
        acc += buf[i];
    }
    acc *= STEP;
    #pragma tuner max_abs_error acc 5

    return 0;
}
