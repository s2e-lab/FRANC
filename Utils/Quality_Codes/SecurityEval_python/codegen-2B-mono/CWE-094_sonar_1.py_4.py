from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    major = None
    minor = None
    micro = None
    ver = None
    import urllib
    
    ver = urllib.quote(ver)
    try:
        v = urllib.urlopen('https://raw.githubusercontent.com/D3Dell/D3D3/master/Version.py')
        major = v.read()
        major = major.replace('Version(\'','')
        major = major.replace('\')','')
        major = major.replace('.Python\',