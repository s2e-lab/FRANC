from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    if request.method == 'POST':
        filepath = request.files['file']
        file = open(str.decode(filepath.file.read()), 'rb')
        tempdirpath = os.path.join(os.getcwd(), 'temp')
        if 'PDF_FILE_HASH' in request.headers:
            pdf_file = request.headers['PDF_FILE_HASH']
        else:
            print "Error, No PDF hash"
            return 'Error'
        save_pdf(tempdirpath, pdf