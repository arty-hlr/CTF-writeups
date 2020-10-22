import sys

r = open(sys.argv[1], "r")
w = open(sys.argv[2], "w")

lines = r.readlines()
w.write(lines[2])
w.write(lines[3])
w.write(lines[4])

r.close()
w.close()
