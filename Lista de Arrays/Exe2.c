#include <stdio.h>

int main() {

    int numeros[8];

    for (int i = 0; i < 8; i++) {
        printf("Digite o numero %d: ", i + 1);
        scanf("%d", &numeros[i]);
    }

    printf("\nNumeros na ordem inversa:\n");

    for (int i = 7; i >= 0; i--) {
        printf("%d\n", numeros[i]);
    }

    return 0;
}
