from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    root = ET.parse(request.files['file'])
    file = root.getiterator('input_file')[0]
    file_contents = file.read()

    print('Uploading: %s' % file_contents)

    tree = ET.Etree()
    tree.parse(file_contents)

    root.remove(file)

    return (ET.tostring(tree), '')
