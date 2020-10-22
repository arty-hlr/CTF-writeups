from time import sleep
from itertools import zip_longest
flag = "flag{I_Think_This_Should_Be_The_Flag}"

def compare_flag(input_flag):
    if(len(input_flag) == 0):
        return False
    for left, right in zip_longest(input_flag, flag):
        print(left,right)
        if(left != right):
            return False
        sleep(0.25) # prevent brute forcing
    return True
