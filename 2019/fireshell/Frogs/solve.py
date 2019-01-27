import socket
import sha256
import jumps
import sys

def receive_until(string):
    received = sock.recv(1024).decode()
    print received
    while string not in received:
        received = sock.recv(1024).decode()
        print received
    return received

sock = socket.socket()

ip = "35.231.144.202"
port = 2006

sock.connect((ip, port))


received = receive_until("string")
toCrack = received[-7:].strip("\n")
print(toCrack)
cracked = sha256.main(toCrack)
sock.send(cracked)

receive_until("start")
sock.send("start")

for i in range(50):
    received = receive_until("N:")
    sock.send(str(jumps.numb(int(received.split(":")[1].strip("Answer")))))

received = receive_until("F#")

sock.close()
