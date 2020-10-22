#!/usr/bin/python3
import itertools, string
import hashlib

def _attack(chrs, toCrack, func):
    hash_functions = {"md5":hashlib.md5, "sha1":hashlib.sha1, "sha224":hashlib.sha224, "sha256":hashlib.sha256, "sha384":hashlib.sha384, "sha512":hashlib.sha512}

    for n in range(1, 31+1):
      for xs in itertools.product(chrs, repeat=n):
          saved = ''.join(xs)
          h = hash_functions[func](saved.encode()).hexdigest()
          if h[-6:] == toCrack[-6:]:
              # print("\n[!] found " + saved + " for " + func)
              # print("[!] " + h)
              return saved


def main(toCrack, func):
    chrs = string.printable.replace(' \t\n\r\x0b\x0c', '')
    return _attack(chrs, toCrack, func);



if __name__ == "__main__":
    main()
