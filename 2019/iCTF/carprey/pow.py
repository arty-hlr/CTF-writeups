#!/usr/bin/env python3

# Similar to OOO's DEF CON 2018 Quals POW

import hashlib
import struct
import sys
import socket

def main():
    sock = socket.socket()
    host = 'carpreylb-514290978.us-west-1.elb.amazonaws.com'
    port = 2014
    sock.connect((host,port))

    received = sock.recv(2048).decode()
    prefix = received.split('Prefix: ')[1].split('\n')[0]
    difficulty = int(received.split('Difficulty: ')[1].strip())
    solved = solve_pow2(prefix, difficulty)
    solved = hex(solved)+'\n'
    sock.send(solved.encode())
    received = sock.recv(1024).decode()
    print(received)


def solve_pow(prefix, difficulty):
	suffix = 0
	while True:
		hash = int(hashlib.md5(prefix.encode("utf8") + struct.pack("<Q", suffix)).hexdigest(), 16)
		if (hash % 2 ** difficulty == 0):
			return suffix
		suffix += 1

def pow_hash(challenge, solution):
    return hashlib.sha256(challenge.encode('ascii') + struct.pack('<Q', solution)).hexdigest()

def check_pow(challenge, n, solution):
    h = pow_hash(challenge, solution)
    return (int(h, 16) % (2**n)) == 0

def solve_pow2(challenge, n):
    candidate = 0
    while True:
        if check_pow(challenge, n, candidate):
            return candidate
        candidate += 1

if __name__ == "__main__":
        main()
	# prefix = sys.argv[1]
	# difficulty = int(sys.argv[2])
	# print(solve_pow(prefix, difficulty))
