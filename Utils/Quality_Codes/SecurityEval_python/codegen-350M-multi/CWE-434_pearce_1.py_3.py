from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    file_to_upload = request.files.get('file')
    if not file_to_upload:
        return redirect('/pdf/upload')
    with open(file_to_upload.filename, 'rb') as file:
        filepath = 'uploads/%s.pdf' % os.path.basename(file_to_upload.filename)
        f = open(filepath, "wb")
        shutil.copyfileobj(file, f)
        f.close()
    filepath = os.path.join(app.