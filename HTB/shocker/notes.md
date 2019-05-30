User:
1. Scanning with nmap we see there is only ssh and http on
2. Running gobuster on http, we find a directory, `cgi-bin`, that gives status code 403, let's dig deeper
3. Rerunning gobuster with option `-x pl,sh,py` on that directory gives us a file, `user.sh`
4. That file being in `cgi-bin`, and the name being "shocker", the box might be vulnerable to shellshock, we try it with `nmap -sV -p80 --script http-shellshock --script-args uri=/cgi-bin/user.sh 10.10.10.56`, but unfortunately that doesn't work
5. Investigating with burp suite, we see that there is one line without variable in the request, which makes the server answer with 500, modifying the nse script to comment out that line, we get the confirmation that it is vulnerable to shellshock, and we do see the resonse in burp with the 15-character string printed
6. Sending a command as a script argument with `cmd=ls` doesn't work though, and after investigating again with burp suite, that payload has to modified with the full path for the command, plus an `echo;` just before to break it from the beginning of the response; we add a `/bin/bash -c "/bin/CMD"` for good measure and that works in burp suite, now we just have to modify the script
7. Sending in a reverse shell command, we got user!

Root:
1. A simple `sudo -l` shows us that user "shelly" can execute perl commands without a password
2. We throw in a simple perl reverse shell command, and voilà! 
