#include <stdio.h>

int main() {

    int numeros[6];
    int busca;
    int indice = -1;

    for (int i = 0; i < 6; i++) {
        printf("Digite o numero da posicao %d: ", i);
        scanf("%d", &numeros[i]);
    }

    printf("Digite o valor que deseja buscar: ");
    scanf("%d", &busca);

    for (int i = 0; i < 6; i++) {
        if (numeros[i] == busca) {
            indice = i;
            break;
        }
    }

    if (indice != -1) {
        printf("Valor encontrado no indice: %d\n", indice);
    } else {
        printf("Valor nao encontrado no array.\n");
    }

    return 0;
}
