from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    img_bnd64 = request.values.get('img_bnd64', None)
    if img_bnd64:
        img = base64.b64decode(img_bnd64)
        filename = 'pictures/' + str(request.values.get('filename', None))
        with open(filename, 'wb') as handle:
            handle.write(img)
        handle.close()
        return 'File uploaded'
    return 'Invalid Request'


@app.route('/api/upload', methods=['POST