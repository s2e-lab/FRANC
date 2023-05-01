from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    file_in = request.files['image_file']
    try:
        filepath = str(file_in.open())
        return filepath
    except FileNotFoundError:
        return "The file that was submitted doesn't exist!"


@app.get('/')
