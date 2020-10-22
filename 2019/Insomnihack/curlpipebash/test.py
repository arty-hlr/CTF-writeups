import os

with open("output", "w") as output:
    for i in range(100):
        with open("out", "r") as f:
            line = f.readline(65) + " > out"
            output.write(line)
            output.write("\n")
            os.system(line)
