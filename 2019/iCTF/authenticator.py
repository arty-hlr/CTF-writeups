import os
import codecs
import nacl.signing
import nacl.encoding
from nacl.exceptions import BadSignatureError
import sys

if __name__ == '__main__':
    vk = nacl.signing.VerifyKey('cc55493e18e25bb47fd8d06aaa5aee0b22b195119a39e05272b608f02b3ffae9', encoder=nacl.encoding.HexEncoder)
    random_message = codecs.decode(codecs.encode(os.urandom(64), 'hex'), 'ascii')
    print('Please sign the following message: {}'.format(random_message))
    signed = input()
    try:
        vk.verify(signed, encoder=nacl.encoding.HexEncoder)
        print('Authenticated')
        sys.exit(0)
    except BadSignatureError:
        sys.exit(1)
                                                                    
