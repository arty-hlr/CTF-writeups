#include <stdio.h>

int main() {
    int n;
    char b[10];
    n = read(45,b,0);
    printf("%d\n",n);
    char b2 = 'c';
    n = write(45,b2,8);
    printf("%d\n",n);

    char buf[10];
    n = read(0,buf,8);
    printf("%d\n",n);
    char buf2[] = "hello\n";
    n = write(0,buf2,8);
    printf("%d\n",n);

    char buf3[10];
    n = read(1,buf3,8);
    printf("%d\n",n);
    char buf4[] = "hello\n";
    n = write(1,buf4,8);
    printf("%d\n",n);

}
