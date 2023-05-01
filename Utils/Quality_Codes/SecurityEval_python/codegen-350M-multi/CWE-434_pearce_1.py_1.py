from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    file_path = request.files.get('file')

    filename = os.path.splitext(file_path.filename)[0]

    # Copy file from upload path
    with open(file_path.filename, 'rb') as file:
        file_contents = file.read()

    # Create the name of the file
    filename = '{}{}'.format(os.path.basename(file_path.filename), '.'.join((filename, ext)))

    response = '''<!DOCTYPE html>
<