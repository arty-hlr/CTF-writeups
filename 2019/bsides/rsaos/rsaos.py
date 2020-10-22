import hashlib
import os
import numbthy
import socket


def findCRC32(f):
    new_crc = '{:08x}'.format(f)
    with open('s'+str(f), 'w') as s:
        s.write('echo aaaa')
    print()
    os.system('python3 forcecrc32.py s'+str(f)+' 5 '+new_crc)
    with open('s'+str(f), 'rb') as s:
        return s.read()

def factor(fh):
    factorsTuple = numbthy.factor(fh)
    factors = []
    for f in factorsTuple:
        factors.append(f[0]**f[1])
    for f in factors:
        if len(hex(f)[2:]) > 8:
            return None
    return factors

def getCRCstrings(s):
    fh = foldhash(s.encode())
    print('foldhash of "{}" is {}'.format(s, hex(fh)))
    factors = factor(fh)
    print()
    print('Factors found:')
    print(factors)
    crcList = []
    for f in factors:
        crcList.append(findCRC32(f)+b'\n')
    return crcList

def getSig(fhFactors):
    e = 0x10001
    n = 0xd888075370effdb016d85de8c894ee7ac2764527210d8ce1d8bd14a06c67de148b4680781366002f9649e3885e18ab950120c660970ab9a499ea74ea7aa38fe732940b5204300ef7b96a608efec1a74007a4b1d592cf9eb23890d8fa416202857d0e0f9ebad79324d03d09db0502ff4bae0b2dfc0b150ddea806a5ff24e2d32f
    sig = 1
    for f in fhFactors:
        sig *= f
        sig %= n
    return sig

def foldhash(n):
    hash = hashlib.sha1(n).hexdigest()
    h1 = int(hash[20:], 16)
    h2 = int(hash[:20], 16)
    fh = h1^h2
    return fh

def receive_until(sock, string):
    received = sock.recv(2048).decode()
    while string not in received:
        received = sock.recv(2048).decode()
    return received

def solve():
    host = 'rsaos-774c47ae.challenges.bsidessf.net'
    port = 9999
    sock = socket.socket()
    sock.connect((host,port))
    received = receive_until(sock, '> ')
    sock.send('debug enable\n'.encode())
    received = sock.recv(2048)

    s = 'get-flag 0'
    toSend = getCRCstrings(s)
    print()
    fhFactors = []
    for b in toSend:
        sock.send(b)
        received = sock.recv(4096)
        f = received[30:].decode().split(')')[0]
        received = sock.recv(4096)
        print("RSA SIG is:")
        print(f)
        print()
        fhFactors.append(int(f, 16))

    sig = getSig(fhFactors)
    s += '\n'
    sock.send(s.encode())
    received = sock.recv(4096).decode()
    toSend = hex(sig)+'\n'
    sock.send(toSend.encode())
    received = sock.recv(4096).decode()
    print(received)
    sock.close()

if __name__ == '__main__':
    solve()
