#include <stdio.h>
#include <stdlib.h>

int main() {
    for (;;) {
        char str[69];
        if(scanf("%s", &str) <= 0) {
            break;
        }
        printf(str);
        fflush(stdout);
    }
}

