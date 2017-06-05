int main() {
    int N = 1024;
    int buf[N];
    int acc = 0;

    for(int i = 0; i < N; i++) {
        buf[i] = i;
    }

    #pragma tuner explore var(1, 10) reference(var=2)
    for (int i = 0; i < N; i += var) {
        acc += buf[i];
    }
    acc *= var;
    #pragma tuner is_negative acc

    return 0;
}
