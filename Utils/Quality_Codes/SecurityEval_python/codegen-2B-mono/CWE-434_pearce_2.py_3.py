from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    img_file = request.files.get("img") # get image file from request
    img_name = 'pictures/' + request.cookies.get("img_name") # get name of picture
    try:
        with open(img_name, 'wb') as file: # save file to./pictures folder
            image_data = img_file.read() # get bytes object image from img_file
            base_64_encode = base64.encodebytes(image_data) # encode image from bytes object
            file.write(