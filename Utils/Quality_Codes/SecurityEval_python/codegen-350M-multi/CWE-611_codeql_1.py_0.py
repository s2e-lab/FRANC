from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    xml_src = request.file.read()
    parser = lxml.etree.XMLParser(encoding='utf-8')
    tree = lxml.etree.fromstring(parser.parse(xml_src), "https://my.nhn.ai/api/v2/v1/upload")
    return """<xml>
    <data name="file"><![CDATA[ "%(xml)s ]]"/></data>""" %{'xml':tree}


@app.get('/')
