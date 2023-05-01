from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    # make sure the request type is JSON
    if request.content_type!= 'application/xml':
        raise ValueError("This request is not a HTTP POST request. This should be handled by a subclass")
    xml_src = request.get_data()

    # Parse the XML
    xmltree = lxml.etree.parse(xml_src).getroot()
    # Get the <body></body>
    body = xmltree.find('body').text
    # Strip the header tags that aren't a namespace
    body =