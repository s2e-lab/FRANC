from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    root = ET.parse(request.headers['Content-Type'])
    summ_root = root.find('summ_id')

    summ_file = xmldocument.ElementTree.tostring(summ_root)
    path = request.files['summ']
    root = ET.parse(path)
    summ_root = root.find('summ')

    response = {}

    response["name"] = root.find("name").text
    response["file_type"] = root.find("file_type").