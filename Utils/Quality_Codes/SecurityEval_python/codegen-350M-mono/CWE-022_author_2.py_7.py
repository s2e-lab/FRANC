import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''

    file = urllib.request.urlopen(url)
    data = json.loads(file.read().decode('utf8'))
    file.close()
    return data

## Download
