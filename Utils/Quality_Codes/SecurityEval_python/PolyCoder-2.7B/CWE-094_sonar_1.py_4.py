from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    version_request = request.build_full_uri()
    import_module('urllib')
    print(url_format(version_request))
    return render_template('index.html', app=app)

@app.route('/info')
