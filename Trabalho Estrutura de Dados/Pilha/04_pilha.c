#include <stdio.h>
#include "04_pilha_funcoes.c"

int main() {
    empilhar(10);
    empilhar(20);
    empilhar(30);
    empilhar(40);
    empilhar(50);

    int removido = desempilhar();
    printf("Numero removido: %d\n", removido);

    printf("Topo da pilha: %d\n", verTopo());

    return 0;
}
