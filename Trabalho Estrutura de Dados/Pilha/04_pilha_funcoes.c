#define MAX 10

int pilha[MAX];
int topo = -1;

int estaVazia() {
    
    return  topo ==1;
}

int estaCheia() {
   
    return topo == MAX -1;
    
}

void empilhar(int valor) {

   topo++;
    pilha[topo] = valor;
}

int desempilhar() {
    if (estaVazia()) {
        return -1;
    }

    int valor = pilha[topo];
    topo--;

    return valor;
}
    

int verTopo() {
    if (estaVazia()){
        return -1;
    }
    return pilha[topo];
    
}
