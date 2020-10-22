from pwn import *

chars = '0123456789abcdef'
aesni = ELF('./aesni')
flag = 'flag-'

def bf(s):
    aesni.write(0x0804807c, s.encode())
    temp = './temp/aesni_'+s
    aesni.save(temp)
    os.chmod(temp, stat.S_IXUSR)
    p = process(temp)
    output = p.recvall() 
    os.remove(temp)
    if output != b'':
        return True
    else:
        return False

flag += pwnlib.util.iters.mbruteforce(bf, chars, 11, 'fixed', start=(16**4,16**11))

