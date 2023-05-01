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
    file = request.files["file"]
    XML_object = lxml.etree.parse(file)
    element = XML_object.getroot()
    userid = element.find("UserID").text
    password = element.find("Password").text
    if checkPassword(userid,password):
        return "Successful"
    else:
        return "Error"

@app.post("/check")
