import socket
import binascii
import base64
import itertools as it
import logging
logging.basicConfig(level=logging.INFO)
from collections import Counter
import json

host = 'beard-party.q.2019.volgactf.ru'
port = 7777
U = [[0x3E8, 0x386, 0x067, 0x19C, 0x158],
    [0x364, 0x33E, 0x3A7, 0x119, 0x1D2],
    [0x324, 0x188, 0x3CB, 0x1B0, 0x131],
    [0x262, 0x1A5, 0x34E, 0x0B7, 0x3ED]]
V = [[0x266, 0x343, 0x3ed, 0x354, 0x17f],
    [0x398, 0x229, 0x34c, 0x251, 0x37b],
    [0x0ba, 0x155, 0x307, 0x37e, 0x318],
    [0x1d1, 0x21e, 0x134, 0x0dc, 0x15a]]
W = [[0x16a, 0x11b, 0x306, 0x05e, 0x0b8],
    [0x04b, 0x3b7, 0x0d5, 0x027, 0x2c8],
    [0x1a9, 0x095, 0x107, 0x36f, 0x2a3],
    [0x0f0, 0x2fe, 0x191, 0x332, 0x1a6]]

def get_span(basis):
    d = len(basis)
    S = set()
    for x in it.product([0,1], repeat=d):
        y = 0
        for i in range(d):
            y ^= basis[i] * x[i]
        S.add(y)
    return list(S)

def return_plaintexts():
    plaintexts = set()
    spans = [[] for _ in range(8)]
    for i in range(8):
        spans[i] = get_span(V[i%4])
    for x in it.product(range(32), repeat=8):
        temp = []
        for i in range(8):
            temp.append(bin(spans[i][x[i]])[2:].zfill(10))
        temp = ''.join(temp)
        assert(len(temp) == 80)
        n = int(temp,2)
        plaintexts.add(hex(n)[2:].zfill(20))
        if len(plaintexts) == 2**16:
            return list(plaintexts)

def recv_until(sock, s):
    received = sock.recv(1024).decode()
    while s not in received:
        received = sock.recv(1024).decode()
    return received

def get_pairs():
    plaintexts = return_plaintexts()
    logging.info('Getting plaintext-ciphertext pairs...')
    n = 2**16
    m = 64
    for i in range(0, n, m):
        sock = socket.socket()
        sock.connect((host,port))
        received = recv_until(sock, ':')
        with open('plaintexts', 'a') as g:
            for j in range(m):
                g.write(base64.b64encode(binascii.unhexlify(plaintexts[i+j])).decode())
                g.write('\n')
        batch = binascii.unhexlify(''.join(plaintexts[i:i+m]))
        toSend = base64.b64encode(batch).decode() + '\n'
        sock.send(toSend.encode())
        received = sock.recv(1024).decode().split('\n\r')[0].encode()
        received = base64.b64decode(received)[:-10]
        with open('ciphertexts', 'a') as f:
            for j in range(m):
                f.write(base64.b64encode(received[j*10:(j+1)*10]).decode())
                f.write('\n')
        logging.info('At {}/{}'.format(i, n))
        sock.close()

def part1(C):
   coset_reps = []
   for i in range(4):
       r = {}
       for j in get_span(U[i]):
           if j in r:
               continue
           for e in get_span(W[i]):
               r[e^j] = j
       coset_reps.append(r)

   def rep(c):
       return tuple(
           coset_reps[i % 4][c_i]
           for i, c_i in enumerate(c)
       )

   counter = Counter(rep(c) for c in C)
   print(counter.most_common(1)[0][1])
   return counter.most_common(1)[0][0]

def main():
    # get_pairs()

    with open('ciphertexts', 'r') as f:
        ciphertexts = []
        for _ in range(2**16):
            line = f.readline()
            n = int(binascii.hexlify(base64.b64decode(line)).decode(),16)
            n = bin(n)[2:].zfill(80)
            ciphertexts.append([int(n[i:i+10], 2) for i in range(8)])
    # with open('pairs_json.js', 'r') as f:
    #     d = json.load(f)
    #     ciphertexts = []
    #     for c in d.values():
    #         n = int(binascii.hexlify(base64.b64decode(c)).decode(),16)
    #         n = bin(n)[2:].zfill(80)
    #         ciphertexts.append([int(n[i:i+10], 2) for i in range(8)])
    res = part1(ciphertexts)
    print(res)

if __name__ == '__main__':
    main()
