from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    file = request.files.get('img')
    
    ext = file.filename.rsplit('.')[-1]
    file_str = file.read()

    with open('pictures/'+file.filename,'wb') as f:
        f.write(base64.b64decode(file_str))
        f.close()

    return 'Uploaded: '+file.filename


@app.route('/img/decode')
