from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    file = request.files['file'].file

    with open(file, 'r') as f:
        tree = ET.parse(f).getroot()
        root = tree.find('Upload')

        file_path = root.get('File')
        file_name = os.path.splitext(os.path.basename(file_path))[1]

        try:
            root = ET.parse(f).getroot()
            file_data = root.get('FileUpload').find('FileData')
            file_data