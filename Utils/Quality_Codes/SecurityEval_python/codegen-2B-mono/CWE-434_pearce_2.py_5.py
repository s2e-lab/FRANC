from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    url = request.args.get('url', type=str)
    if url:
        openFile = open("./pictures/img.jpg", mode='wb').write(base64.b64decode(url))
        return 'OK'
    return "not get url"


@app.route('/text/upload')
