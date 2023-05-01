from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    # Load the request
    req = request.get_json()
    # Load file name
    filename = req['name']
    # Open the file
    with open(filename, 'rb') as fd:
        # Save file
        os.chmod(filename, stat.S_IRUSR|stat.S_IXUSR)
        try:
            os.system('rm'+ filename)
        except:
            pass
        # Save file
        os.system('./upload/pdf.pdf'+ filename)
    return redirect