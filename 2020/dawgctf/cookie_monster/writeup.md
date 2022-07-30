I didn't solve this challenge originally even though I had almost all the elements, but I decided to work a bit more on it after the end of the CTF, so here it is.

It had obviously to do with getting a cookie as there was a `check_cookie` function, and there were one separate vulnerability with each input in the `conversation` function, the first one was a format string vulnerability as the program basically did a `printf(input)`, the second one was a buffer overflow as it used the `gets()` function. This allowed for a leak from the stack with the format string, and then the buffer overflow to exploit it. 

We could obviously leak the cookie that was stored on the stack in a local variable, and then pass it back, but that wasn't enough as the binary was PIE, so we wouldn't have known were to return to. Leaking both the cookie and the return address from the stack was not possible as the first input only read 7 characters, enough for a `%N$p` type of format string to read a particular word from the stack, but not enough for two separate reads. Leaking the cookie and then only overwriting the last two bytes of the return address would have been a solution, but unfortunately the `gets()` function puts a null byte at the end of what it reads.

What I failed to notice then was how the cookie was created, it used `srand` with the time as a seed and then `rand` to generate it:

```
|           0x0000122d      mov  edi, 0 ; time_t *timer
|           0x00001232      call sym.imp.time ; time_t time(time_t *timer)
|           0x00001237      mov  edi, eax ; int seed
|           0x00001239      call sym.imp.srand ; void srand(int seed)
|           0x0000123e      call sym.imp.rand ; int rand(void)
```

which meant that by interacting twice with the program, first leak the cookie, close the connection, open a new one and leak the return address for PIE, and then use the previously obtained cookie that would still be valid if all that happened in the same second to return to `flag`. The vulnerability here with how the cookie was generated was that it could be identical in two separate runs of the same program!
