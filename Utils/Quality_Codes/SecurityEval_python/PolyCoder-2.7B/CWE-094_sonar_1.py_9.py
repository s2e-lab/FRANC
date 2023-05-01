from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    version = request.version

    import subprocess as sp
    try:
        args = [__file__, version.strip(), '--no', '--version']
        process = sp.Popen(args, stdout=sp.PIPE, stderr=sp.PIPE)
    except (AttributeError, ValueError):
        print('The given version {!r} doesn\'t appear to be a version string.'.format(version))
        print