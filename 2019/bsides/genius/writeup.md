Wasn't this a funny challenge! A very nice mix of reverse and pwn, with some Tetris for more fun! Here is a run through of what it was like.

We had two binaries, `loader` and `genius`, as well as access to a server which executes `loader` for us.

Launching `genius` gives us some information about the location of `system()` and of the game object, but we'll come back to that later, and launches a classic Tetris game.

`loader` is already more interesting.

```
Welcome to the Game Genius interface!
Loading game...
...
Loaded!

Please enter your first Game Genius code, or press <enter> to
continue!
```

It seems like we can put a Genius code, whatever that is, followed by another code.

```
Applying patch...
...
...
Done!

Please enter your second code, or press <enter>
```

Reversing it will give us more information about the format of the code and how it is processed. It then proceeds to launch `genius`. We can already guess that the two genius codes enable us to patch the `genius` binary that will be executed by `loader`, but how and where is not yet clear. Reversing `loader` will tell us how, and checking how to get a shell with `genius` will tell us where.

`loader` first loads genius into its memory at `ptr` (ebp-0x2750), and check if the size of the memory read is equal to 0x2730, the size of the genius binary:

```
|           0x08048a99      push 0x8048f22 ; const char *mode
|           0x08048a9e      push str.home_ctf_genius ; 0x8048f25 ; "/home/ctf/genius" ; const char *filename
|           0x08048aa3      call sym.imp.fopen ; file*fopen(const char *filename, const char *mode)
|           0x08048aa8      add  esp, 0x10
|           0x08048aab      mov  dword [stream], eax
|           0x08048aae      cmp  dword [stream], 0
(...)
|       `-> 0x08048ad3      push dword [stream] ; FILE *stream
|           0x08048ad6      push 0x2730 ; '0'' ; size_t nmemb
|           0x08048adb      push 1 ; 1 ; size_t size
|           0x08048add      lea  eax, [ptr]
|           0x08048ae3      push eax ; void *ptr
|           0x08048ae4      call sym.imp.fread ; size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream)
|           0x08048ae9      add  esp, 0x10
|           0x08048aec      cmp  eax, 0x2730 ; '0''
|       ,=< 0x08048af1      je   0x8048b12
```

Moving on, `loader` asks us for a first Game Genius code:

```
|           0x08048b40      push str.Please_enter_your_first_Game_Genius_code__or_press__enter__to ; 0x8048f78 ; "Please enter your first Game Genius code, or press <enter> to" ; const char *s
|           0x08048b45      call sym.imp.puts ; int puts(const char *s)
|           0x08048b4a      add  esp, 0x10
|           0x08048b4d      sub  esp, 0xc
|           0x08048b50      push str.continue ; 0x8048fb6 ; "continue!\n" ; const char *s
|           0x08048b55      call sym.imp.puts ; int puts(const char *s)
|           0x08048b5a      add  esp, 0x10
|           0x08048b5d      mov  eax, dword [obj.stdin] ; [0x804b080:4]=0
|           0x08048b62      sub  esp, 4
|           0x08048b65      push eax ; FILE *stream
|           0x08048b66      push 8 ; 8 ; int size
|           0x08048b68      lea  eax, [s]
|           0x08048b6b      push eax ; char *s
|           0x08048b6c      call sym.imp.fgets ; char *fgets(char *s, int size, FILE *stream)
|           0x08048b71      add  esp, 0x10
|           0x08048b74      movzx eax, byte [s]
|           0x08048b78      cmp  al, 0xa ; 10
|       ,=< 0x08048b7a      je   0x8048d46
|       |   0x08048b80      sub  esp, 4
|       |   0x08048b83      lea  eax, [local_2753h]
|       |   0x08048b89      push eax
|       |   0x08048b8a      lea  eax, [local_2752h]
|       |   0x08048b90      push eax
|       |   0x08048b91      lea  eax, [s]
|       |   0x08048b94      push eax
|       |   0x08048b95      call fcn.080488f3
|       |   0x08048b9a      add  esp, 0x10
|       |   0x08048b9d      sub  esp, 0xc
|       |   0x08048ba0      push str.Applying_patch... ; 0x8048fc1 ; "Applying patch..." ; const char *s
|       |   0x08048ba5      call sym.imp.puts ; int puts(const char *s)
```

Here, we see at address 0x08048b78 that it checks if the first byte is `\x0a`, which is a new line character, and then at 0x08048b95 at calls `fcn.080488f3`. At 0x08048b83 and 0x08048b8a it clearly pushes two addresses, local_2753h and local_2752h to the stack to be used by that function to return values by address. Let's check this function and see what it does:

```
|           0x080488f3      push ebp
|           0x080488f4      mov  ebp, esp
|           0x080488f6      sub  esp, 0x10
|           0x080488f9      mov  eax, dword [arg_8h] ; [0x8:4]=-1 ; 8
|           0x080488fc      movzx eax, byte [eax]
|           0x080488ff      movsx eax, al
|           0x08048902      push eax
|           0x08048903      call fcn.0804885b
|           0x08048908      add  esp, 4
|           0x0804890b      mov  byte [local_1h], al
|           0x0804890e      mov  eax, dword [arg_8h] ; [0x8:4]=-1 ; 8
|           0x08048911      add  eax, 1
|           0x08048914      movzx eax, byte [eax]
|           0x08048917      movsx eax, al
|           0x0804891a      push eax
|           0x0804891b      call fcn.0804885b
|           0x08048920      add  esp, 4
|           0x08048923      mov  byte [local_2h], al
(...)
|           0x0804896e      mov  eax, dword [arg_8h] ; [0x8:4]=-1 ; 8
|           0x08048971      add  eax, 5
|           0x08048974      movzx eax, byte [eax]
|           0x08048977      movsx eax, al
|           0x0804897a      push eax
|           0x0804897b      call fcn.0804885b
|           0x08048980      add  esp, 4
|           0x08048983      mov  byte [local_6h], al
|           0x08048986      movzx eax, byte [local_2h]
|           0x0804898a      and  eax, 8
|           0x0804898d      shl  eax, 4
|           0x08048990      mov  edx, eax
|           0x08048992      movzx eax, byte [local_3h]
|           0x08048996      and  eax, 7
|           0x08048999      shl  eax, 4
|           0x0804899c      or   edx, eax
(...)
|           0x080489d4      mov  edx, eax
|           0x080489d6      mov  eax, dword [arg_ch] ; [0xc:4]=-1 ; 12
|           0x080489d9      mov  word [eax], dx
|           0x080489dc      movzx eax, byte [local_1h]
|           0x080489e0      and  eax, 7
|           0x080489e3      mov  edx, eax
|           0x080489e5      movzx eax, byte [local_1h]
|           0x080489e9      and  eax, 8
|           0x080489ec      shl  eax, 4
|           0x080489ef      or   edx, eax
(...)
|           0x08048a06      mov  edx, eax
|           0x08048a08      mov  eax, dword [arg_10h] ; [0x10:4]=-1 ; 16
|           0x08048a0b      mov  byte [eax], dl
```

Basically we see repeated calls to `fcn.0804885b`, one for each byte of the first 6 bytes of the genius code we entered, and then some bitwise operations on the results, at 0x080489d9 a word (2 bytes) is saved to arg_8h (ebp+0x8) and at 0x08048a0b a byte is saved at arg_10h (ebp+0x10). That is what is gonna be returned.

In `fcn.0804885b`, we see a classic switch table with 26 cases, where each uppercase letter is assigned a number between 0x1 and 0xf, or the value -1:

```
|           0x0804885b      push ebp
|           0x0804885c      mov  ebp, esp
|           0x0804885e      sub  esp, 4
|           0x08048861      mov  eax, dword [arg_8h] ; [0x8:4]=-1 ; 8
|           0x08048864      mov  byte [local_4h], al
|           0x08048867      movsx eax, byte [local_4h]
|           0x0804886b      sub  eax, 0x41 ; 'A'
|           0x0804886e      cmp  eax, 0x19 ; 25
|       ,=< 0x08048871      ja   case.default.0x80488ec
|       |   0x08048873      mov  eax, dword [eax*4 + case.0x804887a.0] ; [0x8048e80:4]=0x804887c case.0x804887a.0
|       |   ;-- switch.0x0804887a:
|       |   0x0804887a      jmp  eax ; switch table (26 cases) at 0x8048e80
|       |   ;-- case 0 (0x804887a):
|       |   0x0804887c      mov  eax, 0
|      ,==< 0x08048881      jmp  0x80488f1
|      ||   ;-- case 15 (0x804887a):
|      ||   0x08048883      mov  eax, 1
|     ,===< 0x08048888      jmp  0x80488f1
|     |||   ;-- case 25 (0x804887a):
|     |||   0x0804888a      mov  eax, 2
|    ,====< 0x0804888f      jmp  0x80488f1
(...)
|  ||||||   ;-- case 13 (0x804887a):
|  ||||||   0x080488e5      mov  eax, 0xf ; 15
| ,=======< 0x080488ea      jmp  0x80488f1
| |||||||   ;-- cases 1...3 (0x804887a):
| |||||||   ;-- case 5 (0x804887a):
| |||||||   ;-- case 7 (0x804887a):
| |||||||   ;-- case 12 (0x804887a):
| |||||||   ;-- case 17 (0x804887a):
| |||||||   ;-- case.default.0x80488ec:
| |||||||   0x080488ec      mov  eax, 0xffffffff ; -1
| ```````-> 0x080488f1      leave
\           0x080488f2      ret
```

Copying all this, the switch table and the bitwise operation in a Python script, we create a table the values associated with all possible permutations of valid letters, see `table_creator.py` in my GitHub, you will have to generate the table yourself as it was to big for GitHub. That enables us to grep for the address we want and see what 6 letters we need to enter.

Returning to main, we see that the value held at local_2752h is compared to 0x2730, and if it is not greater than that, we have a `Bad address!` message and the program exits.

```
|           0x08048bd7      movzx eax, word [local_2752h]
|           0x08048bde      cmp  ax, 0x2730 ; '0''
|       ,=< 0x08048be2      jbe  0x8048bfe
|       |   0x08048be4      sub  esp, 0xc
|       |   0x08048be7      push str.Bad_address ; 0x8048fd3 ; "Bad address!" ; const char *s
|       |   0x08048bec      call sym.imp.puts ; int puts(const char *s)
```

If it is greater thatn 0x2730, we see here that it loads the word at local_2752h into eax, and then the byte at local_2753h in edx, and then moves dl (the low byte of edx) into `[ebp + eax - 0x2750]`, which is the base address for the genius binary read before, plus the word value in eax.

```
|           0x08048c1b      movzx eax, word [local_2752h]
|           0x08048c22      movzx eax, ax
|           0x08048c25      movzx edx, byte [local_2753h]
|           0x08048c2c      mov  byte [ebp + eax - 0x2750], dl
|           0x08048c33      sub  esp, 0xc
|           0x08048c36      push str.Done ; 0x8048fe0 ; "Done!" ; const char *s
|           0x08048c3b      call sym.imp.puts ; int puts(const char *s)
```

From all this, and seeing that `loader` asks us for a second genius code before launching the game, we deduct that it is possible to provide two 6 letters codes which will patch one byte of the genius binary one time each at the desired offset. Great, but what do we patch? Remember that the goal is to spawn a shell to read the flag.

Reminding ourselves that `genius` gives us the address of system() and the address of the game object, we look in the disassembled code of the binary for a way to call system() instead of another function, and provide it with the right parameter, that is `sh;`. At the beginning and the end of the game, we see that memset() is called with as a first argument a pointer s:

```
|           0x0804944e      push 0x1a ; 26 ; size_t n
|           0x08049450      push 0 ; int c
|           0x08049452      push 0x804b1a0 ; void *s
|           0x08049457      call sym.imp.memset ; void *memset(void *s, int c, size_t n)
(...)
|           0x08049547      push 0x1a ; 26 ; size_t n
|           0x08049549      push 0 ; int c
|           0x0804954b      push 0x804b1a0 ; void *s
|           0x08049550      call sym.imp.memset ; void *memset(void *s, int c, size_t n)
```

Well, if we could call system() instead of memset() at some point, and have s point to something beginning by `sh;`, we're set. But what is exactly this pointer s? Just before the first call to memset() we see this:

```
|           0x08049452      push 0x804b1a0 ; void *s
```

And isn't that the game object that genius tells us about upon being executed? After playing a bit of Tetris and checking what value is held at game object, we realize that it's the value created by the blocks already in place at the top of the game, just before losing:

```
+----------+
|    *     |
|   **     |
|   *      |
|   ##     |
|   ##     |
|    #     |
|   ###    |
|    #     |
|   ##     |
|   ##     |
|   ##     |
|   #      |
|   ##     |
|   ###    |
|    ####  |
|   ###    |
|   #      |
|   ##     |
|    #     |
|   ##     |
|   ##     |
+----------+
Game over! You got 9000 points!
```

For example, a top game as such:

```
+----------+
|###     ##|
|##    xxxx|
```

would create the value 0x7f, reading the bits represented by '#' as 1 and ' ' as 0 from left (LSB) to right (MSB) 8 by 8.

So basically, we have to call system() instead of memset(), and play in such a way that the top game looks like this:

```
+----------+
|##  ###   |
| # ## ## #|
|##  xxxxxx|
```
So that the game object begins with `sh;`. But if you have ever played Tetris, you will recognize quickly that this is impossible to achieve, and after scratching our heads a bit, we realized we had to change the game object pointer so that it just points lower in the game!

But first things first, we have to patch the call to memset first, and that is achieved by patching the value in the `.plt` section so that any call to memset() will be redirected to system(), here you will see the difference between a patched binary and the original genius after having a look at the GOT:

```
DYNAMIC RELOCATION RECORDS
OFFSET   TYPE              VALUE
(...)
0804b020 R_386_JUMP_SLOT   system@GLIBC_2.0
(...)
0804b030 R_386_JUMP_SLOT   memset@GLIBC_2.0
```

```
080485e0 <system@plt>:
 80485e0:	ff 25 20 b0 04 08    	jmp    *0x804b020
 80485e6:	68 28 00 00 00       	push   $0x28
 80485eb:	e9 90 ff ff ff       	jmp    8048580 <printf@plt-0x10>
(...)
08048620 <memset@plt>:
 8048620:	ff 25 30 b0 04 08    	jmp    *0x804b030
 8048626:	68 48 00 00 00       	push   $0x48
 804862b:	e9 50 ff ff ff       	jmp    8048580 <printf@plt-0x10>
 ```
In the original genius, calling memset() will jump to 0x804b030 and calling system() will jump to 0x804b020, so we just have to patch the final 30 of the jump to 20, and any call to memset() will now jump to system():

```
8048620:	ff 25 20 b0 04 08    	jmp    *0x804b020
8048626:	68 48 00 00 00       	push   $0x48
804862b:	e9 50 ff ff ff       	jmp    8048580 <printf@plt-0x10>
```

And then, patching the address of the game object in the second call of memset() at the end of the game with a higher address of 0x804b1b4 instead of 0x804b1a0 puts the game object pointer 16 lines lower in the game, with 4 lines underneath to build the right shape with some Tetris skill. This I did by hand, and you can see a pictures of it there.

Well that was it in a nutshell, in the end we had to patch at offset 0x0622 with the byte 0x20 for system() and at offset 0x154c with the byte 0xb4, which resulted in the codes AZZAZT and KLKOGI given by the table. You can see for yourself by playing `patch2` in my GitHub or launching `loader`, putting in the codes and play, in the required way to get `sh;` like in my notes picture!

I hope you could learn something from this writeup, and I do recommend you go through the assembly code of each binary to see what I meant and try the exploit for yourselves, as it is the best way to understand it! The length of this writeup somehow reflects the time I spent on it, it can seem pretty straightforward reading this but it wasn't!
