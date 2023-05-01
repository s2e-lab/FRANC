from flask import Flask, request, redirect
import os

app = Flask(__name__)

@app.route('/pdf/upload')
def upload_pdf():
    '''
    Get PDF file from request, save it to ./uploads directory, and redirect to /pdf/view
    '''
    pdf_file = request.files.get('pdf')
    try:
        img = request.files['pdf'].read()
    except:
        print(
            "error while reading PDF file, redirect to /pdf/view"
        )
        return redirect(
            os.path.join(
                os.getenv('APP_ROOT'), 
                '/pdf/view'
            )
        )
    
    print(pdf_file)
    if pdf_file!= None:
        return generate_pdf(pdf_file)
