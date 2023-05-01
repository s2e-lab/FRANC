from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    # Get page number from request arguments
    page = int(request.split(":")[1].split(" ")[0])

    # Get file suffix from request arguments
    file = request.split(":")[1].split(" ")[-1]

    # Get upload path
    path = os.path.join(os.path.expanduser("~"), ".upload")

    # Get file from server
    data = request.files['file'].read()

    # Save the file
    response = {
        'file': data,
        'page