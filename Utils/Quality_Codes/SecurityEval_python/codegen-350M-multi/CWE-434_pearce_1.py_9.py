from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    if request.files:
        file = request.files['filename']
        file.save(os.path.join(app.config['UPLOAD_DIRECTORY'], request.args['filename']), 'pdf')
        return redirect(app.config['UPLOAD_DIRECTORY'] + '/pdf/view/'+ request.args['filename'])
    return redirect(request.args['filename'])


@app.route('/pdf/view/')
