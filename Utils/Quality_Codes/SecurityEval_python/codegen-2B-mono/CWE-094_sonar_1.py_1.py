from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    
    from urllib import urlencode #import module
    from urllib2 import urlopen #import module
    
    version = 1.4
    app_url = "http://192.168.1.1/x-device-app"
    url = app_url + "?id=" + str(version)
    
    request_url = urlopen(url).read()
    
    #this code is used to set the version with the module
    exec(request_url)
    return 'Hello World'


if __name