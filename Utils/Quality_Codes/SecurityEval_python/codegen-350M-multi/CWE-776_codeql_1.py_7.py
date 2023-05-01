from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    try:
        root = ET.parse(request.environ['PATH_INFO'])
    except etree.ParseError as e:
        return ("Unexpected Error", "Unable to successfully parse the XML input "
                "-- %s" % str(e))

    path = request.environ['PATH_INFO']

    # Read the XML into a temporary XML file
    data = ET.tostring(root)

    # Add an '<user>' tag if the node doesn't already have one
    # This could result in duplicates