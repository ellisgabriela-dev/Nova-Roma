#include <stdio.h>

int main() {

    int numeros[10] = {
        10, -5, 20, -8, 30,
        -2, 15, -10, 40, -3
    };

    for (int i = 0; i < 10; i++) {

        if (numeros[i] < 0) {
            numeros[i] = 0;
        }
    }

    printf("Array apos a substituicao:\n");

    for (int i = 0; i < 10; i++) {
        printf("%d ", numeros[i]);
    }

    printf("\n");

    return 0;
}
