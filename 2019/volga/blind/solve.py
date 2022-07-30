import socket
import binascii
import numbthy
import base64

n = 26507591511689883990023896389022361811173033984051016489514421457013639621509962613332324662222154683066173937658495362448733162728817642341239457485221865493926211958117034923747221236176204216845182311004742474549095130306550623190917480615151093941494688906907516349433681015204941620716162038586590895058816430264415335805881575305773073358135217732591500750773744464142282514963376379623449776844046465746330691788777566563856886778143019387464133144867446731438967247646981498812182658347753229511846953659235528803754112114516623201792727787856347729085966824435377279429992530935232902223909659507613583396967
host = 'blind.q.2019.volgactf.ru'
port = 7070

def factor_cmd(cmd):
    n = int(binascii.hexlify(cmd.encode()), 16)
    factors = numbthy.factor(n)
    l = []
    for f in factors:
        for i in range(f[1]):
            l.append(f[0])
    return l

def get_factor_commands(factors):
    l = []
    # The last factor after encoding contains a single quote alone, which the server didn't like, that's why we combined it with another one
    factors = [factors[1], factors[0]*factors[2]]
    for f in factors:
        n = hex(f)[2:]
        if len(n)%2 == 1:
            n = '0'+n
        l.append(binascii.unhexlify(n))
    return l

def main():
    cmd = 'cat flag'
    factors = factor_cmd(cmd)
    command_list = get_factor_commands(factors)
    sock = socket.socket()
    sock.connect((host,port))

    signatures = []
    for c in command_list:
        received = sock.recv(4096).decode()
        sock.send(b'0 sign\n')
        received = sock.recv(4096).decode()
        toSend = base64.b64encode(c).decode()+'\n'
        sock.send(toSend.encode())
        received = sock.recv(4096).decode()
        signatures.append(int(received))

    signature = 1
    for i in signatures:
        signature = (signature*i)%n

    received = sock.recv(4096).decode()
    toSend = str(signature) + ' ' + cmd + '\n'
    sock.send(toSend.encode())
    flag = sock.recv(4096).decode()
    print(flag.strip())

if __name__ == '__main__':
    main()
