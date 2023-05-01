from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    if request.args.get('file'):
        # redirect to /pdf view
        # if '?extension' in request.args:
        #     # set extension
        try:
            if request.args.get('extension').startswith('.pdf'):
                filename = request.args.get('file')
                if not os.path.isfile(filename):
                    return render_template('error_msg.html',
                                           message="Please upload a PDF, if you don't select the appropriate URL")
                else: