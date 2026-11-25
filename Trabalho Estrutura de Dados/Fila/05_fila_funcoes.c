/*
 * Exercício 05 - Funções da Fila
 *
 * Implemente aqui as funções da fila usadas em 05_fila.c.
 */

#define MAX 10

int fila[MAX];
int inicio = 0;
int fim = 0;

int estaVazia() {
   
    return inicio == fim;
}

int estaCheia() {
   
    return fim == MAX;
}

void enfileirar(int valor) {
    
    fila[fim] = valor;
    fim++;
}

int desenfileirar() {
  if (estaVazia()) {
        return -1;
    }

    int valor = fila[inicio];
    inicio++;

    return valor;
}

int verInicio() {
      if (estaVazia()) {
        return -1;
    }

    return fila[inicio];
}
