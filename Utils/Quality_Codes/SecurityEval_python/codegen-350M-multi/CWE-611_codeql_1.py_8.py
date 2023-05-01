from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    upload_xml_src = request.files['upload_file'].file.read()
    logger.debug(upload_xml_src)
    response = requests.post(
        "https://raw.githubusercontent.com/konluc/RSS2RSSUploader/master/rss2rss.xml",
        data={"xml_src": upload_xml_src}).json()
    logger.debug(response)
    return response

@app.post("/showitem")
