import marshal, dis

fd = open("challenge_fix_unblvr.pyc","rb")
magic = fd.read(8) # magic + mtime
data = list(fd.read())
#data[26] = '\x00'
# data[91] = chr(9)
# data[92] = chr(9)
# data[99] = chr(9)
# data[100] = chr(9)
# data[188] = chr(9)
# data[189] = chr(9)

#with open("patched.pyc","wb") as fw:
#    fw.write(magic)
#    fw.write(''.join(data))

# print(data.index(chr(124)))
print(list(enumerate(data)))#[:40])
#print(map(ord,data[:40]))

code = marshal.loads(''.join(data))
print(dis.dis(code))