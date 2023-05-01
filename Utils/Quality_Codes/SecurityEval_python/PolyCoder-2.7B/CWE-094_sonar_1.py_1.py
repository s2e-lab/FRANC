from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    version = request.args.get('version')

    if (version) and ((version == '1') or (version == '2') or (version == '3')):
        # execute version
        import execversion
        execversion.VersionInfo('Flask')

    app.version = app.version + str(version)  # add prefix to get the version number
    return render_template('index.html', version=version)

