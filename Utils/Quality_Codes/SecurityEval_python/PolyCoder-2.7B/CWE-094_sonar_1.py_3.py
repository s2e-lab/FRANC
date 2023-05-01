from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    import_module = 'Flask.util'
    return {'version': exec('import_module ='+ import_module)[0]}

@app.route('/<int:version>', methods=['POST'])
