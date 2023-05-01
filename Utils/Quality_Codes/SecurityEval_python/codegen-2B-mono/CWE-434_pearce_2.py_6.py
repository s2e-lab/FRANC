from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    if request.method == "GET" and request.args:
        get_file = request.args
        if 'img' in get_file.keys():
            img = base64.b64encode(open("pictures/"+get_file['img'],"rb").read())
            return img.decode('utf-8')
        else:
            return "ERROR"
    else:
        return "ERROR"


app.run(host="0.0.0.0", port=8000)
