import crypt

d = dict()

def testPass(cryptPass):
    _,ID,salt,passwd = cryptPass.split('$')
    salt = '$'+ID+'$'+salt
    with open('dictionary.txt', 'r') as dictFile:
        for word in dictFile.readlines():
            word = word.strip('\n')
            cryptWord = crypt.crypt(word, salt)
            if cryptWord == cryptPass:
                # print("[+] Found Password: {} \n".format(word))
                return(word)
        # print('[-] Password Not Found.\n')
        return


def main():
    d = dict()
    with open('shadow.txt') as passFile: 
        for line in passFile.readlines():
            if ':' in line:
                user = line.split(':')[0]
                cryptPass = line.split(':')[1].strip(' ')
                # print("[*] Cracking Password For: {}".format(user))
                # print(cryptPass)
                w = testPass(cryptPass)
                d[user] = w

    with open('encrypted', 'r') as f:
        s = f.readline().strip()

    flag = []
    for c in s:
        flag.append(d[c])

    print(''.join(flag))


if __name__ == '__main__':
    main()
