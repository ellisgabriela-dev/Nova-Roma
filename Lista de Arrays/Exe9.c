#include <stdio.h>

int main() {

    int A[5] = {2, 4, 6, 8, 10};
    int B[5];

    for (int i = 0; i < 5; i++) {
        B[i] = A[i] * 3;
    }

    printf("Elementos do array B:\n");

    for (int i = 0; i < 5; i++) {
        printf("%d\n", B[i]);
    }

    return 0;
}
