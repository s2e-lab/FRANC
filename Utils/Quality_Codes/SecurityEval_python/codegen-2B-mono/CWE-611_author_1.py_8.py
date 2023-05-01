from flask import Flask, request
import lxml.etree

app = Flask(__name__)


def checkPassword(userid, password):
    pass


@app.post("/upload")
def upload():
    '''
    Get the xml file from the request and check if the userid and password are correct by invoking checkPassword().
    '''
    if "user" in request.files:
        xml_file=lxml.etree.parse(request.files["user"])
        root=xml_file.getroot()
        return {'data': checkPassword(root.attrib["userid"], root.attrib["password"])}, 200
        print(request.files)


@app.post("/login")
