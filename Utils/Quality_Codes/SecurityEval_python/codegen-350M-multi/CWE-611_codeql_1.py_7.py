from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    image = request.files.get('image')
    if not image:
        return "Error: no image supplied"
    file_base = os.path.splitext(str(image.name))[0]
    image_contents = (
        lxml.etree.fromstring(str(image.read()))))
    
    return image_contents


@app.route('/add')
