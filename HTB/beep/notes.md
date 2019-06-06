User/root:
1. A scan on the box gives us lots of services, among which a http server
2. The webserver is apparently for a service called Elastix, which is a calling service
3. Searching for a vulnerability, we find a FreePBX/Elastix vulnerability, which we can download
4. Trying out the vulnerability, we need to setup a proxy with burp so that we don't use https, and we have to specify an extension, let's bruteforce for the first 1000 extensions
5. That gives us a shell with user asterisk on extension 233, which we can upgrade to root following the instructions in the exploit script!
