from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    exec("""import urllib""")
    module = ""
    if request.args.get('mod'):
        module += "."+request.args.get('mod')
    exec("from "+module+" import version as __version__")
    exec("import version")

    data = dict(
        module=module,
        version=__version__
    )

    return flask.jsonify(data)

@app.route('/send')
