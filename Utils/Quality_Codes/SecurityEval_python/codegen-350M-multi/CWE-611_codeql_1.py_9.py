from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    filename = request.files['file']
    file = open(filename.filename)
    doc_xml = lxml.etree.parse(file)
    return doc_xml


@app.post("/delete")
