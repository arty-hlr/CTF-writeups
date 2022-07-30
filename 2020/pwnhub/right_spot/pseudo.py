def dump():
    # dump 0 to 4
    return

def deserialize():
    read(w1,4)
    read(w2,4)
    # SIGNED!
    if w1*w2 > 5:
        exit()

    counter = 0
    # UNSIGNED!
    while counter < w1*w2:
        length = read(4)
        if length != 0:
            arr = this + 4 + counter * 0x18
            resize(arr,length)
            addr = arr[0]
            read(addr,length)
        counter += 1

def main(argc,argv):
    if argc == 2:
        seed = atoi(argv[1])
    else:
        seed = random(8)

    # heap = 0x5655d000
    # pad  = 0x5655f000
    # munmap pad
    # mprotect region_seed r only
    # mmap 0x56c00000 or 0x57000000 w/x for 0x800000 bytes

    deserialize()
    dump()

main()
