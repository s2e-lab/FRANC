from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    from urllib import  request
    import urllib
    import simplejson
    import sys
    import socket
    import math

    module_version = simplejson.dumps({ "version":  "2.0.0" })
    host_name = request.remote_addr
    host_ip = socket.gethostbyname(host_name)
    app_type = 'Python Flask'
    os_type = str(sys.platform)
    python_version = sys.version_info
    python_implementation = sys.implementation