from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    return request.method == 'POST' and 'pdf/upload' in request.files

@app.route('/pdf/view', methods=['GET', 'POST'])
