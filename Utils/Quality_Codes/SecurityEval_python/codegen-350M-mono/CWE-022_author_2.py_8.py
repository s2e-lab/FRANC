import json
import urllib.request as request
def readJSON(url):
    '''
    Read a json file from a url
    and return the parsed json object
    '''
    file_name = url.split('.')[-1]
    file_path = './../../../' + file_name
    try:
        file = open(file_path,'rb')
        obj = json.load(file)
        file.close()
    except FileNotFoundError:
        file = open('./' + file_name, 'rb')
        obj = json.load(file)
        file.close()
    return obj

