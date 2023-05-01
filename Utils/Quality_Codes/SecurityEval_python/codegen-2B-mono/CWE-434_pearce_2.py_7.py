from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    if request.method == "GET":
        return "Wrong way for GET request", 405 #status code for not supported method

    img_data = str(request.form.get('img_in_byte'))
    if img_data: #get image data
        image = base64.b64decode(img_data)
    else: #default image
        image = b'0'

    try:
        img_bytes = open('pictures/picture.png', 'wb')
    except:
        return "Image cannot be saved", 405