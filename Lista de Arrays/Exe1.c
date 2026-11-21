#include <stdio.h>

int main() {

    int numeros[5] = {10, 20, 30, 40, 50};

    printf("Elementos do array:\n");

    for (int i = 0; i < 5; i++) {
        printf("%d\n", numeros[i]);
    }

    return 0;
}
