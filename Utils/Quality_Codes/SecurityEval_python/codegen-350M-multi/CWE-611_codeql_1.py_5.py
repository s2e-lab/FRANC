from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    if 'file' not in request.files:
        abort(400)
    file = request.files.get('file')
    file.save("tmp.xml")
    if app.config['IMAGE_ENROLLMENT']:
        xml = request.get_data_as_str("file", no_load=True)
        parser = lxml.etree.HTMLParser()
        xml = parser.parse(xml)
        tree = ET.parse(file)
        tree.make_parent()
        tree.write(file)