#include <stdio.h>

int main() {

    float numeros[10] = {
        1.5, 2.5, 3.0, 4.5, 5.0,
        6.5, 7.0, 8.5, 9.0, 10.0
    };

    float soma = 0;

    for (int i = 0; i < 10; i++) {
        soma += numeros[i];
    }

    printf("A soma dos valores e: %.2f\n", soma);

    return 0;
}
