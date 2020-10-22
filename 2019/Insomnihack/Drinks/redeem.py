import os
import sys

with open(sys.argv[1], "r") as f:
    line = f.read().replace("\x0a", "\\n")

os.system('curl -H "Accept: application/json" -H "Content-Type: application/json" -d \'{"encryptedVoucher":"' + line + '","passphrase":"WATER_2019"}\' http://146.148.126.185/redeemEncryptedVoucher')
