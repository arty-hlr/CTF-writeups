This was a very beginner level challenge actually, but I'll describe it quickly anyway.

The C source code was provided, which made things even easier as there wasn't any reversing involved. The meat of the binary was these lines:

```C
        int lock = 0;
        char buf[64];
        printf("I made this really cool flag but Governor Hogan put it on lockdown\n");
        printf("Can you convince him to give it to you?\n");
        gets(buf);
        if(lock == 0xdeadbabe){
                flag_me();
```

It was a basic buffer overflow without any hardening, the lock variable is located just after the buf variable on the stack (check that in gdb), and overflowing the buf with 4 more bytes to match the hex value in the if conditional triggered the `flag_me` function!

As an exercise, you can now try to pwn it without that crutch and only the overflow, but it's PIE, so that might be a problem ;)
