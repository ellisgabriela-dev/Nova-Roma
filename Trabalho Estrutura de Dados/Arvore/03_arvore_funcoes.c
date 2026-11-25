
#include <stdio.h>
#include <stdlib.h>

 typedef struct No {
    int valor;
    struct No *esquerda;
    struct No *direita;
}No;

struct No* criarNo(int valor) {
    struct No *novo = (struct No *)malloc(sizeof(struct No));

    if (novo == NULL) {
        return NULL;
    }

    novo->valor = valor;
    novo->esquerda = NULL;
    novo->direita = NULL;
    return novo;
}

No* inserir(No *raiz, int valor) {
    if (raiz == NULL) {
        return criarNo(valor);
    }

    if (valor < raiz->valor) {
        raiz->esquerda = inserir(raiz->esquerda, valor);
    } else {
        raiz->direita = inserir(raiz->direita, valor);
    }

    return raiz;
}

void preOrdem(No *raiz) {
    if (raiz == NULL) {
        return;
    }

    printf("%d ", raiz->valor);
    preOrdem(raiz->esquerda);
    preOrdem(raiz->direita);
}

void emOrdem(No *raiz) {
    if (raiz == NULL) {
        return;
    }

    emOrdem(raiz->esquerda);
    printf("%d ", raiz->valor);
    emOrdem(raiz->direita);
}

void posOrdem(No *raiz) {
    if (raiz == NULL) {
        return;
    }

    posOrdem(raiz->esquerda);
    posOrdem(raiz->direita);
    printf("%d ", raiz->valor);
}

void emNivel(No *raiz) {
    if (raiz == NULL) {
        return;
    }

    No **fila = NULL;
    int inicio = 0;
    int fim = 0;
    int capacidade = 10;

    fila = (No **)malloc(capacidade * sizeof(No *));
    if (fila == NULL) {
        return;
    }

    fila[fim++] = raiz;

    while (inicio < fim) {
        No *atual = fila[inicio++];
        printf("%d ", atual->valor);

        if (atual->esquerda != NULL) {
            if (fim == capacidade) {
                capacidade *= 2;
                No **novaFila = (No **)realloc(fila, capacidade * sizeof(No *));
                if (novaFila == NULL) {
                    free(fila);
                    return;
                }
                fila = novaFila;
            }
            fila[fim++] = atual->esquerda;
        }

        if (atual->direita != NULL) {
            if (fim == capacidade) {
                capacidade *= 2;
                No **novaFila = (No **)realloc(fila, capacidade * sizeof(No *));
                if (novaFila == NULL) {
                    free(fila);
                    return;
                }
                fila = novaFila;
            }
            fila[fim++] = atual->direita;
        }
    }

    free(fila);
}
