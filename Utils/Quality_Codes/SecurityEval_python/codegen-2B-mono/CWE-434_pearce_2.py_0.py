from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    result = "no img uploaded"
    img_name = request.args.get('img_name')
    path = os.getcwd() + "/pictures/"
    file_path = path + img_name
    if os.path.exists(file_path):
        os.remove(file_path)


    file_binary = request.files.get('images')
    file_binary.save(file_path)

    result =  "img successfully uploaded: " + file_path
    return result

@app.route('