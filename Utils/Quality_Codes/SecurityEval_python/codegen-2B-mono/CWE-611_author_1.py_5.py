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
    global root2
    if request.content_type == 'application/xml':
        root2 = lxml.etree.parse(request.data).getroot()
        userid = request.form["userid"]
        if checkPassword(userid, request.form["password"]):
            return "Success"
        return "Wrong password"
    return "File type not application/xml"


@app.get("/check")
