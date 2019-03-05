That was a nice crypto challenge from bsidesCTF, even though it maybe was a bit overscored, 666 was a lot for what it really was. Here we go!

Getting the connection to the server with nc showed us the following:
```
      ___           ___           ___           ___           ___     
     /\  \         /\  \         /\  \         /\  \         /\  \    
    /::\  \       /::\  \       /::\  \       /::\  \       /::\  \   
   /:/\:\  \     /:/\ \  \     /:/\:\  \     /:/\:\  \     /:/\ \  \  
  /::\~\:\  \   _\:\~\ \  \   /::\~\:\  \   /:/  \:\  \   _\:\~\ \  \
 /:/\:\ \:\__\ /\ \:\ \ \__\ /:/\:\ \:\__\ /:/__/ \:\__\ /\ \:\ \ \__\
 \/_|::\/:/  / \:\ \:\ \/__/ \/__\:\/:/  / \:\  \ /:/  / \:\ \:\ \/__/
    |:|::/  /   \:\ \:\__\        \::/  /   \:\  /:/  /   \:\ \:\__\  
    |:|\/__/     \:\/:/  /        /:/  /     \:\/:/  /     \:\/:/  /  
    |:|  |        \::/  /        /:/  /       \::/  /       \::/  /   
     \|__|         \/__/         \/__/         \/__/         \/__/    


>
```

Typing `help` at the command prompt gave us a bit more:
```
> help
Unprivileged commands:
    date                Get the date
    debug               Debug the OS.
    echo                Echo the arguments.
    enable              Enable all commands as privileged.
    exit                Exit the OS.
    foldhash            Get foldhash of arguments
    get-publickey       Retrieve the Public Key
    help                Get information about all commands.
    md5                 Get md5 of first argument

Privileged commands:
    get-flag            Get the flag.
    get-privatekey      Retrieve the Private Key
    security            Get information about security.
```

And from there began the quick exploration. First, let's have a look at the public key:

```
> get-publickey
Public key parameters:
N: 0xd888075370effdb016d85de8c894ee7ac2764527210d8ce1d8bd14a06c67de148b4680781366002f9649e3885e18ab950120c660970ab9a499ea74ea7aa38fe732940b5204300ef7b96a608efec1a74007a4b1d592cf9eb23890d8fa416202857d0e0f9ebad79324d03d09db0502ff4bae0b2dfc0b150ddea806a5ff24e2d32f
E: 0x10001
```

Enabling debug and having a look at security told us a bit more about how things worked:
```
> debug enable

> help security
DBG: CRC-32(0x65ba5dc5) SIG(0x3305c41233266f256e0ea10c616fa6d2f3130a34142d88c59d4136789b0f388095372c9ec4060b498fe47f9a257a3ce7060996a501d3322c6506c80d8387bb61497b5812772cb92d2656470b8035894f1bc1f2a621ca27d61f5544dd183380c3af6fe3e6d64e01a47c0e90fb46c257aec853ab7c0dabbe899ca21a0e5f54b204)
security

	Authentication and authorization for operations is provided by RSA signing.
	Unpriviliged commands are automatically signed by the client using the IEEE
	CRC-32 of the full command line.

	Privileged commands must be manually signed by RSA over the FoldHash of the
	full command line.  FoldHash is a hash that was developed in response to the
	Shattered attack on SHA-1.  FoldHash provides 80 bits of security by use of
	an exclusive-or operation on the output of the standard SHA-1 hash split in
	two.

	All RSA signing operations are unpadded signatures of the hash value in
	big endian order.  This avoids attacks where only bad sources of entropy are
	available.
```

So unprivileged commands were signed using the CRC32 of the full command, but privileged ones used the foldhash of the full command. What it means in a nutshell is that:
- `SIG(unprivileged) = pow(CRC32(unprivileged), D, N)`
- `SIG(privileged) = pow(foldhash(privileged), D, N)`

And to get the flag for example, we'd have to provide the OS with that last signature:

```
> get-flag
RSA(FoldHash) sig:
Privileged command validation failed!
```

We then realize that if we can get the CRC32 of some request to be a certain value, we get the signature of that certain value. Mmh. What if these certain values somehow made up the foldhash? Then using the multiplicative property of RSA, by multiplying together (mod N) the signatures, we'd get the signature for the required foldhash!

The strategy was then to get the foldhash of, for example `get-flat`, factor it, craft requests whose CRC32 are each equal to one of the factors, make those requests to the OS, get the signatures, multiply them together mod N, and voila, we have the signature for the required foldhash. The only trouble on the road was that factoring the foldhash for `get-flag` gave us factors too big to be a CRC32 (bigger than 32 bits), but trying with `get-flag 0` worked and we could use that.

```
> echo test
DBG: CRC-32(0xd7984604) SIG(0x4e8cf2f94e94802c6cf03c6d09efc7c8e7a5e930f0c9c5154e6700d074185359f14fa4733adffb76c316c3963ad7c9a87bb90fdce935b91ed1682afea08fb1bc85e2324a930bc67d99bfdd3fad35accbff3aa7c8cdca69bcda5dd5d60e2df08d99f9e119f23fd00a9c7eab3428e352d2fd7c307a34167650bc37ef4e6d3fd3e9)
test

>
```

Crafting the requests was a natural thing with the presence of the `echo` command in the OS, we just had to create them so that the CRC32 of each request is equal to one of the factors of the foldhash. For this, we used this tool: https://www.nayuki.io/page/forcing-a-files-crc-to-any-value which was perfect for the task.

Well, the rest was programming, which took some time with some mistakes and problems along the road, but we made it and you can find the source code I used in this GitHub!
