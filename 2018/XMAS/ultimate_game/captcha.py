import socket
import md5
import sys

sock = socket.socket()

ip = sys.argv[1]
port = int(sys.argv[2])

sock.connect((ip, port))

received = sock.recv(1024).decode()
toCrack = received[-7:]
print(toCrack)
cracked = md5.main(toCrack)
sock.send(cracked)
received = sock.recv(4096).decode()
print(received)
received = sock.recv(4096).decode()
print(received)
sock.close()
