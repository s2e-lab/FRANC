from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''

    # the version number in the request objects for the file is an integer, while the number returned
    # in the request object is a string
    ver = (request.args.get('version', None)).split('.')[0]

    # request.args is a list, so flatten it out again to get a list of strings
    ver = [ver]

    # this gets the module name and version of the module from the request object
    module_name, version = request.args.get('