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
    xml_data = request.get_data()
    tree = lxml.etree.ElementTree(lxml.etree.fromstring(xml_data))
    root = tree.getroot()
    loginname = root.find("LoginName").text
    userid = root.find("UserId").text
    passwd = root.find("Passwd").text

    # Get the values from the root element instead of the child elements
    userid = root.Userid
    passwd = root.Passwd
    loginname = root.LoginName