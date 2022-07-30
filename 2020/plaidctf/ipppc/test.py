from multiprocessing import Pool
from itertools import product
import string

def test(t):
    n = int(''.join(t))
    return n

p = Pool(8)
for res in p.imap(test, product(string.digits, repeat=5)):
    if res == 87478:
        print('got it')
