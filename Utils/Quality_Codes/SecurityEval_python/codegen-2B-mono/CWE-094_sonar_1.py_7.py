from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''

    file = open("version.py", "r")
    version = file.read()
    exec(version)
    file.close()

    return 'Module version: {version}'.format(version=version)

@app.route('/upload', methods=['POST'])
