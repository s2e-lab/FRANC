from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''

    url = request.url
    version = urllib.parse.urlparse(url).path

    print('Url: {} | Version: {}'.format(url, version))

    with open('./version.md', 'w') as f:
        f.write('## \n\
        Version information (automatically changed at project build) \
        <a href="{}">Link</a>. \
        <br>\n\
        The project version is: {}. \
        '.format(url, version))
    return '',