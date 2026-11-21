#include <stdio.h>

int main() {

    float notas[4];
    float soma = 0;
    float media;

    for (int i = 0; i < 4; i++) {
        printf("Digite a nota do %d bimestre: ", i + 1);
        scanf("%f", &notas[i]);

        soma += notas[i];
    }

    media = soma / 4;

    printf("\nA media do aluno e: %.2f\n", media);

    return 0;
}
