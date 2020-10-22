import functools
import operator
import random
from os import urandom

from crypto_commons.generic import xor, long_to_bytes


def encrypt(key, data, mask):
    state_len = len(key)
    keystream = key_extend(len(data), key, mask, state_len)
    data = "".join([bin(ord(c))[2:].zfill(8) for c in data])
    result = xor(map(int, data), keystream)
    result = "".join(map(str, result))
    return long_to_bytes(int(result, 2)).encode("hex")


def key_extend(data_len, key, mask, state_len):
    keystream = key
    for x in range(data_len * 8 - state_len):
        state = keystream[-state_len:]
        state = map(lambda val: val[0] & val[1], zip(state, mask))
        new_bit = functools.reduce(operator.xor, state, 0)
        keystream.append(new_bit)
    return keystream


def padding(n):
    return "".join(urandom(n))


def main():
    state_length = 32
    pad_min = 256
    pad_max = 512
    m = "This cipher is military grade LFSR with random padding, key and mask! Good luck & have fun! Inputs were generated to be solvable"
    key = [random.choice([0, 1]) for _ in range(state_length)]
    mask = [random.choice([0, 1]) for _ in range(state_length)]
    flag = open("flag.txt", 'r').read()
    msg = padding(random.randrange(pad_min, pad_max)) + m + padding(random.randrange(pad_min, pad_max)) + " " + flag
    encrypted = encrypt(key, msg, mask)
    print(encrypted)


main()
