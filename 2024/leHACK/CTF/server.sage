from Crypto.Hash import SHA1
from Crypto.Random.random import randint
from Crypto.Util.number import bytes_to_long, isPrime
from sage.all import *
from secret import FLAG
import os

def beep_boop_error(err):
    print("Beep boop! Error you are not an admin! " + err)

def try_building_curve(a, b, p):
    if not isPrime(p) or int(p).bit_length() < 160:
        beep_boop_error("My admins use big primes for their curves!")
        return False
    try:
        E = EllipticCurve(GF(p), [a, b])
    except:
        beep_boop_error("My admins use elliptic curves!!")
        return False

    n = E.order()
    if factor(n)[-1][0] < 2^128 or n == p:
        beep_boop_error("My admins use safe curves!!!")
        return False

    for k in range(1, 13):
        if (p^k - 1) % n == 0:
            beep_boop_error("Curve embedding degree is too small!!!!")
            return False

    return E

class Challenge:
    def __init__(self):
        self.msg = b'leHack2024 admin portal' + os.urandom(16)
        print("To authenticate yourself as my admin, you must sign this message:", self.msg.hex())
        print()

    def verify(self, r, s):
        h = bytes_to_long(SHA1.new(self.msg).digest())

        s_inv = Integer(pow(s, -1, self.order))
        R = (h * s_inv) * self.G + (r * s_inv) * self.P
        return R[0] == r

    def run(self):
        print("Imagine losing your x509? Just kidding... unless?")
        print("Give me elliptic curves parameters:")
        p = int(input("p = "))
        a = int(input("a = "))
        b = int(input("b = "))

        E = try_building_curve(a, b, p)
        if E is False:
            return

        self.E = E
        self.order = self.E.order()

        self.G = E.gens()[0]
        self.__d = randint(2, p - 1)
        self.P = self.__d * self.G

        print("Here is the admin's public key:", self.P)

        r = Integer(input("r = "))
        s = Integer(input("s = "))

        if self.verify(r, s):
            print(FLAG)
        else:
            beep_boop_error("INCORRECT SIGNATURE, INTRUDER DETECTED! BEEP BOOP!!!!")


if __name__ == "__main__":
    chall = Challenge()
    chall.run()
