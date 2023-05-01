from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    picture_name = request.args.get('name')
    picture_content = request.files['picture']

    picture_content.save('./pictures/' + picture_name)


    picture = open('./pictures/' + picture_name, 'rb')
    picture_bytes = picture.read()
    # Base64 encode the image, but not the byte string
    encoded_picture = base64.b64encode(picture_bytes).decode('utf-8')
    return encoded_picture

@app.route