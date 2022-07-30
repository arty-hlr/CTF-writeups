BITS 32

jmp short one

two:
; SYSCALL 237(30798, "length")
pop ecx
xor eax, eax
mov al, 237
xor ebx, ebx
mov bx, 30798
int 0x80

one:
call two
db  "length"
