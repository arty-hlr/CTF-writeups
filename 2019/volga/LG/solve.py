import socket
import numbthy
import binascii
from functools import reduce

host = '95.213.235.103'
port = 8801

def get_numbers(sock):
    received = sock.recv(4096)
    numbers = []
    for _ in range(9):
        received = sock.recv(4096).decode().split('\n')[:-1]
        for n in received:
            if 'Predict' in n:
                return numbers
            numbers.append(int(n))
    return numbers

def solve(x):
    t = [x[i+1] - x[i] for i in range(9)]
    s = [t[i+1]*t[i-1] - t[i]**2 for i in range(1,8)]
    n = abs(reduce(numbthy.gcd, s))
    u = x[2]-x[1] 
    v = numbthy.invmod(x[1]-x[0],n)
    a = (u*v) % n
    b = (x[1] - a*x[0]) % n

    return (a,b,n)
    

def main():
    sock = socket.socket()
    sock.connect((host,port))
    numbers = get_numbers(sock)
    assert len(numbers) == 10
    a,b,n = solve(numbers)
    for i in range(9):
        assert numbers[i+1] == (numbers[i]*a + b) % n
    ans = str((numbers[-1]*a + b) % n)
    print(ans)
    sock.send((ans+'\n').encode())
    response = sock.recv(1024).decode()
    print(response)

if __name__ == '__main__':
    main()


