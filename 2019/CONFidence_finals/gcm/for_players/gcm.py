import os
import random

from cryptography.hazmat.primitives.ciphers.aead import AESGCM


def long_to_bytes(data):
    return hex(data).replace("0x", "").replace("L", "").decode("hex")


def generate_random_key(bitsize):
    return long_to_bytes(random.randint(2 ^ (bitsize - 1), 2 ^ bitsize)).zfill(bitsize / 8)


def encrypt(key, data):
    aesgcm = AESGCM(key)
    nonce = os.urandom(12)
    ct = aesgcm.encrypt(nonce, data, None)
    encrypted_data, tag = ct[:-16], ct[-16:]
    return encrypted_data


def main():
    key = generate_random_key(128)
    flag = open("flag.png", "rb").read()
    open("flag.png.enc", "wb").write(encrypt(key, flag))


if __name__ == '__main__':
    main()
