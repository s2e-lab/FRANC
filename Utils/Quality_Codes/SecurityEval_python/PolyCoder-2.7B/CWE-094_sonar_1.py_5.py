from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    return {'version': f'{__version__}'}


@app.route('/login', methods=['GET', 'POST'])
