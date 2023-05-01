import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    with request.urlopen(url) as _request:
        _bytes = _request.read()
        print('parsed json:')
        print(_bytes.decode('utf-8'))
        print('-' * 40)
        jsonObj = json.loads(_bytes.decode('utf-8'))
        print(json.dumps(jsonObj, indent=4, sort_keys=True))
        return jsonObj

