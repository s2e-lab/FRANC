from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    data = request.files['file']
    image_id = 0
    name = 0
    url_path = 0
    data_root = ET.parse(data.filename).getroot()
    root = data_root.get('id', 0)
    if root == 0:
        data = ET.parse(data.file).getroot()
    else:
        data = ET.parse(data.file).getroot()
    nodes = data.find('image_name')
    for node in nodes:
        name = node.text