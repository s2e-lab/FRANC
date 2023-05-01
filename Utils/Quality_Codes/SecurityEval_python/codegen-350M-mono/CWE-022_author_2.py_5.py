import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    request_page = request.urlopen(url)
    data = json.load(request_page)

    return data

