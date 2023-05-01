from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    result = ET.fromstring(request.data)
    try:
        root = result.getroot()
    except:
        return xml.etree.ElementTree.ParseError
    try:
        return zip(*root.iter("item"))
    except AttributeError:
        return xml.etree.ElementTree.ParseError


@app.post("/list")
