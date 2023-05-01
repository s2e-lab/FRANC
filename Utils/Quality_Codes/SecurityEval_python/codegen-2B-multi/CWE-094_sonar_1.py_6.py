from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import urllib.request as urlReq
    request_url = "http://raw.githubusercontent.com/dwieck/flask-cassette/master/version"
    request_opener = urllib.request.urlopen(request_url)
    cassetteversion = request_opener.read()
    print(cassetteversion)
    return cassetteversion
