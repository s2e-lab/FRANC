from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import urllib.request
    print("request %s" % request.__dict__[0])  # this can be used for debugging
    print(urllib.request)  # this can be used to check the version to the end of your request
