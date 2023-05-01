import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    with request.urlopen(url) as response:
        data = json.loads(response.read().decode('utf-8'))
    return data


