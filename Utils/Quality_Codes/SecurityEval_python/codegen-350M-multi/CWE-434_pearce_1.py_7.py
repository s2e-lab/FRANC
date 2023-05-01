from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    response = requests.get('http://pdf.amsterdam-online.nl/~eekin/images/f1/%s' % request.args.get('name', 'unknown file')[0], stream=False).text
    dest_file = os.path.join(os.path.dirname(os.path.abspath(__file__)), 'uploads', request.args.get('name', 'unknown file')[0])

    return '<h1>Document</h1>' + response.decode('utf-8'), 200,