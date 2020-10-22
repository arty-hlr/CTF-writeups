from time import sleep
from Crypto.Cipher import AES
import string

def shift(x):
    return x[-2:]+x[:-2]

ciphertexts=open('Ciphertext.txt').read().split('\n')
print(len(ciphertexts))
key='6f52655f5468416e5f345f4c614b204d'
key = shift(key)
l=''
idx=0
alpha=string.printable

byHand = True
# byHand = False

while idx>=0:
    while True:
        for i in range(256):
            key=key[:-2]+hex(i)[2:].zfill(2)
            aes=AES.new(key.decode('hex'),AES.MODE_ECB)
            a = aes.decrypt(ciphertexts[idx].decode('hex'))
            ok=1
            if byHand:
                print(a + '\t'*4 + key)
            else:
                if idx==0:
                    print(a)
                    sleep(0.5)
                if 'BEETHOVEN' in a:
                    break
                for b in a:
                    if not b in alpha:
                        ok=0
                        break
                if ok:
                    break
        if ok:
            if byHand:
                quit()
            else:
                l=a
                print(idx,a,key)
                idx-=1
                key=shift(key)
                break
