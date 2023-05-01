from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    #appname = urlparse.urlparse(url).netloc
    #module = urlparse.urlparse(url).path.split("/")[0]
    #version = module.split(".")[1]

    #exec( module + " " + version );

    #print module + " " + version

    return "Index Page"

@app.route("/get", methods=['GET'])
