from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import urllib2
    import sys

    s = urllib2.urlopen('https://docs.flask.org/about/')
    contents = s.read()

    filename = 'flask-mod-version.py'
    mod_version_filename = 'flask_mod_version.py'
    if filename == '':
        mod_version_filename = sys.argv[0]

    with open(mod_version_filename,