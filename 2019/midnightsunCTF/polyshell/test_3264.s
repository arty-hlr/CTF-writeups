BITS 32
xor eax, eax
inc eax
jz x64

jmp short one32

two32:
xor eax, eax
mov al, 157
xor ebx, ebx
mov bx, 17804
pop ecx
syscall
push 1
pop eax
syscall

one32:
call two32
db "country"

x64:
jmp short one64

two64:
xor rax, rax
mov al, 157
xor rdi, rdi
mov di, 17804
pop rsi
syscall

one64:
call two64
db "country"
