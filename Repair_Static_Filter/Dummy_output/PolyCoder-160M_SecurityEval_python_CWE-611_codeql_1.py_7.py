from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
# Import the original file that is required for the flask post process
# lxml.etree.load_file returns an empty file and raises an error.

