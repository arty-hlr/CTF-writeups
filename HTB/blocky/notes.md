User:
1. Scanning the box, we get an http server with a wordpress, and by scanning all ports there is a Minecraft server on port 65565.
2. We can run gobuster on the http server with the common wordlist (`gobuster -u 10.10.10.37 -w /usr/share/wordlists/dirb/common.txt`), and we find a few directories
3. In the `/plugins` directory, we find some .jar files, which we can download, extract, and decompile with `jad`, that gives us a nice password for sql, but maybe that password was reused for ssh or ftp, we just have to find which user, as root doesn't work.
4. Coming back to the results of the scan, we can run `wpscan -e u` on the wordpress website, and we get an user "notch".
5. Trying `ssh notch@10.10.10.37`, we get access!

Root:
1. Checking `sudo -l`, we see that user notch can run ALL, so a simple `sudo su` gives us a root access!
