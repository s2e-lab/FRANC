from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import urllib.request, urllib.error, urllib.parse
    exec_url = urllib.request.urlopen('http://dummy2.restapiclient.com/getversion?' + urllib.parse.urlencode({"version_name":"TestyServer"}))
    return exec_url.read()


@app.route('/test/health')
