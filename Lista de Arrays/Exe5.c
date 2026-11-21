#include <stdio.h>

int main() {

    float precos[5] = {100, 50, 80, 120, 200};

    printf("Reajuste de 10%% nos produtos:\n\n");

    for (int i = 0; i < 5; i++) {

        float antes = precos[i];
        float depois = antes * 1.10;

        printf("Produto %d\n", i + 1);
        printf("Antes: R$ %.2f\n", antes);
        printf("Depois: R$ %.2f\n\n", depois);
    }

    return 0;
}
