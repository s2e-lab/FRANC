from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    src = request.files['file'].first.filename # get the name from the request
    with open('/Users/vladimir/Downloads/' + src) as src:  # open the image file.
        img = lxml.etree.parse(src)  # parse the image XML file
        return img.text
app.secret_key = "very secret"

@app.route('/', methods=['POST']) 
