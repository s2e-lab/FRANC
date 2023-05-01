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
    req_data = request.get_data()
    # get the xml tree
    doc_tree = lxml.etree.parse(req_data)
    doc = doc_tree.getroot()
    for user in doc:
        user.attrib["userid"] = user.tag + "_name"
    # get the data
    userid = doc._get_tag("User_ID")
    password = doc._get_tag("Password")
    status = checkPassword(userid, password)
    status_code = 200
    if