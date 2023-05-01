from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    xml_string = request.files['raw'].filename
    with open(xml_string) as xml_file:
        xml = ''
        if xml_string.lower().endswith('.xml'):
            try:
                tree = ET.parse(xml_file)
                tree.read()
                xml = ET.tostring(tree, encoding='utf-8')
            except Exception as e:  # pylint: disable=broad-except
                raise Exception(e)
        return xml


@app.get('/')