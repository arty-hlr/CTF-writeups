That challenge probably took me way longer than it should have taken! I ended up writing the functions from assembly into python to reproduce what the binary was doing, which was a good exercise, but completely unnecessary as we'll see.

The binary called 3 functions in main after checking that our input's length was 43:

```
|           0x000013bf      call sym.imp.strnlen
|           0x000013c4      cmp  rax, 0x2b ; rsi
|       ,=< 0x000013c8      je   0x13de
|       |   0x000013ca      mov  eax, 0
|       |   0x000013cf      call fcn.00001195
|       |   0x000013d4      mov  edi, 1 ; int status
|       |   0x000013d9      call sym.imp.exit ; void exit(int status)
|       `-> 0x000013de      mov  eax, 0
|           0x000013e3      call fcn.000012f2
|           0x000013e8      mov  eax, 0
|           0x000013ed      call fcn.000011f7
|           0x000013f2      mov  eax, 0
|           0x000013f7      call fcn.000011bb
```

The first function, 000012f2 was quite short and easy to figure out, it was simply applying a NOT to each byte of our input:

```
|      :|   0x00001304      lea  rdx, [0x00004040]
|      :|   0x0000130b      movzx eax, byte [rax + rdx]
|      :|   0x0000130f      not  eax
|      :|   0x00001311      mov  ecx, eax
|      :|   0x00001313      mov  eax, dword [var_4h]
|      :|   0x00001316      cdqe
|      :|   0x00001318      lea  rdx, [0x00004040]
|      :|   0x0000131f      mov  byte [rax + rdx], cl
|      :|   0x00001322      add  dword [var_4h], 1
|      :`-> 0x00001326      cmp  dword [var_4h], 0x2a ; '*'
```

The second function, 000011f7, was a bit complex, and actually performed two distinct operations: it first looped through the input and reversed each byte in a mirror fashion, which took longer than it should have to identify:

```
|    .----> 0x0000122b      mov  eax, dword [var_ch]
|    :|:|   0x0000122e      mov  edx, 1
|    :|:|   0x00001233      mov  ecx, eax
|    :|:|   0x00001235      shl  edx, cl
|    :|:|   0x00001237      mov  eax, edx
|    :|:|   0x00001239      and  al, byte [var_12h]
|    :|:|   0x0000123c      mov  byte [var_11h], al
|    :|:|   0x0000123f      cmp  byte [var_11h], 0
|   ,=====< 0x00001243      je   0x1260
|   |:|:|   0x00001245      mov  eax, dword [var_ch]
|   |:|:|   0x00001248      mov  edx, dword [var_4h]
|   |:|:|   0x0000124b      sub  edx, eax
|   |:|:|   0x0000124d      mov  eax, edx
|   |:|:|   0x0000124f      sub  eax, 1
|   |:|:|   0x00001252      mov  edx, 1
|   |:|:|   0x00001257      mov  ecx, eax
|   |:|:|   0x00001259      shl  edx, cl
|   |:|:|   0x0000125b      mov  eax, edx
|   |:|:|   0x0000125d      or   byte [var_13h], al
|   `-----> 0x00001260      add  dword [var_ch], 1
```

and then swapped bytes around, first with last, second with second to last, etc:

```
|      :|   0x0000129b      lea  rdx, [0x00004040]
|      :|   0x000012a2      movzx eax, byte [rax + rdx]
|      :|   0x000012a6      mov  byte [var_11h], al
|      :|   0x000012a9      mov  eax, 0x2a ; '*'
|      :|   0x000012ae      sub  eax, dword [var_8h]
|      :|   0x000012b1      cdqe
|      :|   0x000012b3      lea  rdx, [0x00004040]
|      :|   0x000012ba      movzx edx, byte [rax + rdx]
|      :|   0x000012be      mov  eax, dword [var_8h]
|      :|   0x000012c1      cdqe
|      :|   0x000012c3      lea  rcx, [0x00004040]
|      :|   0x000012ca      mov  byte [rax + rcx], dl
|      :|   0x000012cd      mov  eax, 0x2a ; '*'
|      :|   0x000012d2      sub  eax, dword [var_8h]
|      :|   0x000012d5      cdqe
|      :|   0x000012d7      lea  rcx, [0x00004040]
|      :|   0x000012de      movzx edx, byte [var_11h]
|      :|   0x000012e2      mov  byte [rax + rcx], dl
|      :|   0x000012e5      add  dword [var_8h], 1
|      :`-> 0x000012e9      cmp  dword [var_8h], 0x14
```

The last function, 000011bb, simply did a strcmp, which was easy to check in gdb (after some fiddling around as the binary was PIE) and gave the following as the value it was doing the strcmp agains:

```
00000000: 41f5 51d1 4d61 d5e9 6989 19dd 0911 89cb  A.Q.Ma..i.......
00000010: 9dc9 69f1 6dd1 7d89 d9b5 5991 59b1 3159  ..i.m.}...Y.Y.1Y
00000020: 6dd1 8b21 9dd5 3d19 1179 dd              m..!..=..y.
```

As it turns out, the three different operations, NOT, flipping bits, and flipping bytes, were independent from each other and could thus used both ways, and we could have used the goal value as input to the binary, and then read the flag off gdb at the strcmp!

Overall it was a good exercise in learning to recognize assembly patterns which translate to C/python code, and quite an easy challenge in the end!
