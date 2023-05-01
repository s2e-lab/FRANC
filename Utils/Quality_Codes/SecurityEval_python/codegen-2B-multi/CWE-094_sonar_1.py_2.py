from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    exec("import urllib")
    return "This is the module version %s!" % (urllib.version)

    
@app.route('/main')
