offsets_f = open('offsets', 'r')
bit_positions_f = open('bit_positions', 'r')
bits_f = open('out', 'r')

t = offsets_f.readlines()
offsets = []
for item in t:
    offsets.append(int(item, 16))
t = bit_positions_f.readlines()
bit_positions = []
for item in t:
    bit_positions.append(int(item, 16))
t = bits_f.readlines()
bits = []
for item in t:
    bits.append(int(item, 16))

flag = ['.' for _ in range(104)]

for i in range(104):
    temp = [2 for _ in range(8)]
    offset = offsets[i]
    positions = bit_positions[8*i:8*(i+1)]
    t = bits[8*i:8*(i+1)]
    current_bits = []
    for b in t:
        if b == 0:
            current_bits.append(1)
        else:
            current_bits.append(0)

    for j in range(8):
        temp[positions[j]] = str(current_bits[j])
    temp.reverse()
    flag[offset] = chr(int(''.join(temp), 2))

with open('flag', 'w') as f:
    print(''.join(flag))
    f.write(''.join(flag))
    








offsets_f.close()
bit_positions_f.close()
bits_f.close()
