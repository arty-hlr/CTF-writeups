#!/usr/bin/python3

import requests
import json

def submit(flags):
    if type(flags) == str:
        flags = [flags]
    host = 'http://monitor.ructfe.org/flags'
    token = '387_f897dc4322e75eb29b1889635dc859f3'
    headers = {'X-Team-Token':token}
    r = requests.put(host, headers=headers, data=json.dumps(flags))
    return json.loads(r.content)

