#include <stdio.h>
#include "03_arvore_funcoes.c"

#define TAMANHO 10

int main() {
    int numeros[TAMANHO] = { 50, 30, 80, 20, 40, 70, 90, 10, 60, 100 };
    No *raiz = NULL;

    for (int i = 0; i < TAMANHO; i++) {
        raiz = inserir(raiz, numeros[i]);
    }

    printf("Pre-ordem: ");
    preOrdem(raiz);
    printf("\n");

    printf("Em ordem:  ");
    emOrdem(raiz);
    printf("\n");

    printf("Pos-ordem: ");
    posOrdem(raiz);
    printf("\n");

    printf("Em nivel:  ");
    emNivel(raiz);
    printf("\n");

    return 0;
}
