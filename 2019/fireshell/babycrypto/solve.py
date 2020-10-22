dump = '7b58b065a3689497aea96894a7aa66a3689994a2ae949aa398a7aea5a9669e65a356b2'

flag = ''

for i in range(0,len(dump),2):
    temp = dump[i:i+2]
    print temp
    flag += chr(int(temp, 16) - 53)

print flag
