from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    return 'V1.0'


@app.route('/version', methods=['GET', 'POST'])
