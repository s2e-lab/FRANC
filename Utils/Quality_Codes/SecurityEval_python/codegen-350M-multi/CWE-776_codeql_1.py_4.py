from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''

    tree = ET.ElementTree(ET.fromstring(request.files.get('upload')))
    document = tree.get('root')

    elementName = document.find('.//{http://www.w3.org/2000/svg}defs').attrib['target']
    elementId = document.attrib['id']

    image = document.find('.//img[@class="%s"]' % elementName)
    attrib = image.attrib
    dim = int(attrib["width"])
    dim = int