import serial
import os
import time
import numpy as np
import binascii

s = serial.Serial("/dev/ttyUSB0", 9600)

def encrypt_something(something):
    s.write("x\n")
    response = s.read(4)
    assert len(something) == 32
    s.write("p"+something.upper()+"\n")
    resp =  s.read(34)
    _ = s.read(4)
    return resp.rstrip()
    
def write_pt_ct():
    with open("plaincipherpairs.txt", "a") as fd:
        for _ in range(1):
            plaintext = os.urandom(16).encode('hex')
            ciphertext = encrypt_something(plaintext)
            print(ciphertext)
            fd.write(plaintext + ':' + ciphertext + '\n')
            time.sleep(1)

def read_pt():
    pt = np.empty((72,16),dtype=np.uint8)
    with open('samples/plaincipherpairs.txt', 'r') as f:
        data = f.readlines()
    for i,l in enumerate(data):
        d = binascii.unhexlify(l.split(':')[0])
        for j,n in enumerate(d):
            pt[i,j] = n
    return pt

def read_traces():
    traces = np.empty((72,10022),dtype=np.float)
    i = 0
    for f in sorted(os.listdir('samples')):
        if f == 'plaincipherpairs.txt':
            continue
        data = open('samples/'+f,'r').readlines()[21:-1]
        for j,d in enumerate(data):
            traces[i,j] = float(d.split(',')[1])
        i += 1
    print(traces)
    assert(traces[0].all() == traces[6].all())
            

def main():
    encrypt_something('AAAA')
    # read_pt()
    # read_traces()

if __name__ == '__main__':
    main()
