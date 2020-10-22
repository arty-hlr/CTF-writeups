import os

# get the order elementary checks the bytes in from the disassembly:
# ndisasm elementary | grep -o 'add ax,byte +0x.*$' | grep -o '0x.*$' | uniq > offsets
# add '0x0' before line 102 (only offset that isn't in the disassembly, we had to check by hand where the 0th offset was...)

charset = '}{_-abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'

with open('offsets', 'r') as f:
    t = f.readlines()
    offsets = [int(n,16) for n in t]

toSend = ['.' for _ in range(104)]

i = 8
for offset in offsets:
    addToScript = 'b function'+str(i-8)+'\n'
    with open('current_script.gdb', 'w') as cur_scr:
        with open('script2.gdb', 'r') as scr:
            cur_scr.write(addToScript)
            for line in scr:
                cur_scr.write(line)

    for char in charset:
        toSend[offset] = char
        with open('in', 'w') as g:
            g.write(''.join(toSend)+'\n')
        os.system("gdb --batch --command=current_script.gdb --args ./elementary 2> /dev/null | grep -oE 'function([0-9]+)' | grep -oE '[0-9]+' | tail -1 > output")
        with open('output', 'r') as output:
            o = int(output.read())
        print(o)
        if o >= i:
            break

    print(''.join(toSend))
    i += 8

print(''.join(toSend))
