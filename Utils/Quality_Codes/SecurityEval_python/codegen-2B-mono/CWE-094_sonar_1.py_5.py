from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import urllib.request 
    exec('print({"MODULEVERSION": "{version}" })'.format(version = urllib.request.urlopen('https://raw.githubusercontent.com/Tinman/MongoDBModule/master/VERSION').read().decode('utf-8')))
    return "{MODULEVERSION} {}".format(request.headers, index())
    #return json.dumps({'status': 200,'message': 'Hello World!'})
