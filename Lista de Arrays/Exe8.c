#include <stdio.h>

int main() {

    int numeros[12];
    int pares = 0;
    int impares = 0;

    for (int i = 0; i < 12; i++) {
        printf("Digite o numero %d: ", i + 1);
        scanf("%d", &numeros[i]);

        if (numeros[i] % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    }

    printf("\nQuantidade de numeros pares: %d\n", pares);
    printf("Quantidade de numeros impares: %d\n", impares);

    return 0;
}
