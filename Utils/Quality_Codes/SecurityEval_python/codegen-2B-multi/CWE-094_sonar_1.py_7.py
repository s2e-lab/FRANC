from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''

#	print urllib.quote(request.args.get('query'))
    response = urllib.quote(str(request.args.get('query')), 'utf-8')
    return response
