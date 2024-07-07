import binascii
encrypted = binascii.unhexlify('ADA78B85868DBCB1F9BF94A8FCAA90B6E0BCB78BB8AF88EDEAB9A9EFEA81B1958C80D096987F')

for n in range(0x100):
    if encrypted[0]^n == ord('l'):
        print(n)
