from flask import Flask, request, redirect
import base64

app = Flask(__name__)

@app.route('/img/upload')
def upload_img():
    '''
    Get image file from request and save it to ./pictures folder after encoding
    '''
    if request.method == 'POST':
        # check file format
        extension = request.files['imgfile'].filename.split('.')[1]
        if extension not in ['jpg','png']:
            return error('Invalid image file format.png')
        file = request.files['imgfile']
        if file.filename!= '' and file.filename!= '':
            # save image data
            f = open('./pictures/%s.%s' % (str(len(list(os.listdir('./pictures'