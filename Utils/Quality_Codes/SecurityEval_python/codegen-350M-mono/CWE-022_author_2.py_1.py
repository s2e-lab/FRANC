import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    try:
        with request.urlopen(url) as response:
            if response.info().get_code() == 200 :
                return json.loads(response.read().decode('utf-8'))
    except Exception as e: # catch *all* errors
        print ('Error Code: {}'.format(e.errno), type(e), e)
    print ('Received error code:', response.info().get_code(), type(response.info().get_code()))
    return False