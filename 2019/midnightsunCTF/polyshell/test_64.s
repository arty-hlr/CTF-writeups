BITS 64

jmp short one

two:
xor rax, rax
mov al, 184
xor rdi, rdi
mov di, 58397
pop rsi
syscall
xor rax, rax
mov al, 60
xor rdi, rdi
syscall

one:
call two
db "count", 0x00
