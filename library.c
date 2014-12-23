#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int printInt(int a) {
        printf("%d\n", a);
        return 0;
}

int printFloat(float a) {
        printf("%f\n", a);
        return 0;
}

int iexp(int a, int b) {
        int ret = 1;
        for (int i = 0; i < b; i++) {
                ret *= a;
        }
        return ret;
}

float fexp(float a, float b) {
        return powf(a, b);
}

float IntToFloat(int a) {
    return (float) a;
}

int IntToFloat(float a) {
    return (int) a;
}
