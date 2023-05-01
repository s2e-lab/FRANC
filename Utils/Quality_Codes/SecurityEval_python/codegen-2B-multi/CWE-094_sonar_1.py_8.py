from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    exec __import__('version')
    # Return the version number to the caller
    return 'Module version %s' % version.version


app.debug = True

