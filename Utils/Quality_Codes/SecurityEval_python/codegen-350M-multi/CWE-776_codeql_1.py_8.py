from flask import Flask, request
import xml.etree.ElementTree as ET

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Reads the XML from the incoming request.
    Parse it and return.
    '''
    path = request.files["upload"].name
    with open(path, "rb") as f:
        return f.read()


# This is where the main rendering function is run.