import socket
from Crypto.Cipher import AES
import binascii
import hashlib
import random
import binascii

def bruteforce(enc, key1, key2):
    for i in range(1, 10001):
        random.seed(i)
        key = 0xffffffff
        for i in range(10):
           key ^= random.randint(0x00000000, 0xffffffff)
        secret = hashlib.sha256(str(key).encode('ascii'))
        hex_secret = secret.hexdigest()
        if hex_secret[:15] == key1 and hex_secret[-15:] == key2:
            encryption_suite = AES.new(secret.digest(), AES.MODE_CBC, 'LmQHJ6G6QnE5LxbV')
            pt = encryption_suite.decrypt(enc)
            return pt


sock = socket.socket()
host = 'quals.shadow-league.org'
port = 5002
sock.connect((host,port))

received = sock.recv(1024).decode()
received = sock.recv(1024).decode()
s = received.split('Secret key is ')[1]
s = s.split('\n[')[0]
key1,key2 = s.split('...')
key2 = key2.strip()
s = received.split('Encrypted Challenge : ')[1]
enc = binascii.unhexlify(s.split('Give me')[0].strip())
print(received)
decrypted = bruteforce(enc, key1, key2)
sock.send(decrypted + '\n')
received = sock.recv(1024).decode()
received = sock.recv(1024).decode()
print(received)
