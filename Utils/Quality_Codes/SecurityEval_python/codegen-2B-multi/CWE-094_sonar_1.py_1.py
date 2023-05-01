from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''

    #  Version is first argument of the __init__() function of Flask 
    #  The __version__ is the version of Flask loaded. 
    module_version = "v0.1" #importing Flask is the first thing
    version_url = "http://pypi.python.org/pypi/Flask/"
    
    try: #to catch an exception 
        version_str = exec(open(version_url).read())
    except NameError: #if the version doesn't exist in the URL
        version_str =