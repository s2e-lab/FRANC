from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    data = request.get_data ('/files')
    tree = ET.fromstring(data)
    return ET.tostring(tree['file'])

if __name__ == '__main__':
    app.run()
