import socket
import sha256_3
import decode
import sys
import os
import base64

sock = socket.socket()

ip = "35.231.144.202"
port = 2007

def receive_until(string):
    received = sock.recv(1024).decode()
    print(received)
    while string not in received:
        received = sock.recv(1024).decode()
        print(received)
    return received

def main():
    sock.connect((ip, port))


    received = receive_until("string")
    toCrack = received[-5:-1]
    print(toCrack)
    cracked = sha256_3.main(toCrack)
    sock.send(cracked.encode("UTF-8"))

    receive_until("start")
    sock.send("start".encode("UTF-8"))

    for i in range(20):
        received = receive_until("Here::")
        b64string = received.split("::")[1].split("\n")[0].replace("\n", "")
        os.system("echo -n " + b64string + " | base64 -d > file.mid")
        string = base64.a85decode(decode.midi_dec("file.mid")).decode('UTF-8')
        sock.send(string.encode("UTF-8"))

    received = receive_until("F#")

    sock.close()

if __name__ == "__main__":
    main()
