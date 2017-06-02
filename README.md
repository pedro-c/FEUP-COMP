# FEUP-COMP

### Grupo-5 - P19 - Auto - Project about offline autotuning

An autotuner for C programs. The user adds pragmas to the source code and the auto-tuner automatically determines the best values for some constants.

```
#pragma tuner explore STEP(1, 10) reference(STEP=1)
for (int i = 0; i < N; i += STEP) {
    acc += buf[i];
}
acc *= STEP;
#pragma tuner max_abs_error acc 5
```

The auto-tuner would automatically instrument the source code to find the fastest value of STEP that has an absolute error of abs of 5.

The project consists of:
  * Parsing the pragmas
  * Modifying the code to include the instrumentation/validation code
  * Re-running the program multiple times
  * Report the best version

Another example would be:

```
#pragma tuner explore STEP(1, 10) reference(STEP=1)
for (int i = 0; i < N; i += STEP) {
    acc += buf[i];
}
acc *= STEP;
#pragma tuner is_even acc
```
