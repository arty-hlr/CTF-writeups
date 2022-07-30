BITS 32

jmp short one

two:
pop ecx
xor eax, eax
mov al, 184
xor ebx, ebx
mov bx, 58397
int 0x80
xor eax, eax
mov al, 1
xor ebx, ebx
int 0x80

one:
call two
db "count", 0x00
