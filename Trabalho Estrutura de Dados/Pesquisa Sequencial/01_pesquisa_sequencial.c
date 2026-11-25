#include <stdio.h>

#define TAMANHO 10

int buscarUltimoPar(int vetor[], int tamanho) {

    int posicao = -1;

    for (int i = 0; i < tamanho; i++) {

        if (vetor[i] % 2 == 0) {
            posicao = i;
        }
    }

    return posicao;
}

int main() {

    int numeros[TAMANHO] = {3, 8, 5, 12, 7, 9, 4, 11, 15, 21};

    int posicao = buscarUltimoPar(numeros, TAMANHO);
   if (posicao != -1) {
        printf("O ultimo numero par esta na posicao %d\n", posicao);
    } else {
        printf("Nenhum numero par encontrado.\n");
    }

    return 0;
}