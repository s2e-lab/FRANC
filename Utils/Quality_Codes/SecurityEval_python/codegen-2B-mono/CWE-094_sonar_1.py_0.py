from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import urllib
    if request.args.get('v') is not None:
        x = request.args.get('v')
        urllib.quote(x, '')
    import sys
    return f'''\