import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    with request.urlopen(url) as response:
        data = response.read().decode('JSON')
        parsedData = json.loads(data) # Return the parsed json
    return parsedData

# readJson('http://api.gios.com/v1/records/data', '/gios-records/records', 'test.json')
# parseJson('http://api.gios.com/v1/records/data', '/gios-records/records', 'test.json')

