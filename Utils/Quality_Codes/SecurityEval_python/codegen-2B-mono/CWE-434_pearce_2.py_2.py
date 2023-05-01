from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    file = request.files.get('img')

    if file is None:
        return "not an img file"
    
    img = file.read()
    
    # encode from base64 to binary
    str = base64.b64encode(img).decode('utf-8')

    # format img name
    name = str[:12] + '.jpg'
    
    # save to./pictures folder
    file.save(f'pictures/{name}')

    # return formatted img path url
    return f'/