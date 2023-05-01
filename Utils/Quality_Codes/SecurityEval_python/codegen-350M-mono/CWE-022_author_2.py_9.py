import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    request_response = request.urlopen(url)
    data = request_response.read().decode('utf-8')
    return json.loads(data)

