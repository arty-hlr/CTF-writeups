import socket
import binascii

sock = socket.socket()

ip = '35.198.113.131'
port = 50000

def receive_until(string):
    received = sock.recv(1024).decode()
    print(received)
    while string not in received:
        received = sock.recv(1024).decode()
        print(received)
    return received

def main():
    sock.connect((ip, port))


    received = receive_until("alpha:")
    lines = received.split('\n')
    alpha = int(lines[2][7:])
    p = int(lines[3][3:])
    print('alpha is {}'.format(alpha))
    print('p is {}'.format(p))

    a = 1
    A = pow(alpha, a, p)
    print(A)
    sock.send((str(A)+'\n').encode())

    received = receive_until('B:')
    lines = received.split('\n')
    B = int(lines[0].split('B: ')[1])
    # print(B)
    ciphertext = int(lines[2].split("b'")[1].strip("'"), 16)
    # print(ciphertext)

    key = pow(B, a, p)
    print(hex(key)[2:])

    plaintext = ciphertext ^ key
    print(("I sent: "+hex(plaintext)[2:]+"\n"))
    sock.send((hex(plaintext)[2:]+"\n").encode('UTF-8'))


    sock.close()

if __name__ == "__main__":
    main()
