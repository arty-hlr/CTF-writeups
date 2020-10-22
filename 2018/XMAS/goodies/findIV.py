with open("flag.enc", "r") as flagEnc:
    output = flagEnc.read().strip()

flag = "X-MAX{"

IV = []
for i in range(6):
    IV.append(hex(ord(flag[i]) ^ int(output[i*2:(i*2)+2], 16)))

print IV
