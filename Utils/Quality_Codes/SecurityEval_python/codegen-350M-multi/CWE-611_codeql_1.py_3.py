from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    try:
        xml_src = request.form['xml_src']
    except KeyError:
        return "Missing arguments for XML data."
    else:
        html_src = ''
        tree = lxml.etree.XML(xml_src)
        tree.parse()
        tree_root = tree.getroot()

        # Parse XML.
        for node in tree_root:
            if (node.tag == "file"):
                html_src += node.text

        # Parse HTML.
        for node in