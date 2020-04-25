from pwn import *

context.log_level = 'warning'
code = '''
mov ax, {}
aaa
mov ebx,eax
mov eax,0x1
int 0x80'''

d = {}
for i in range(0x100):
    result = run_assembly_exitcode(code.format(hex(i)))
    if result not in d.values():
        d[i] = result
    log.warning('{}, {}'.format(i,result))

print(d.values())


