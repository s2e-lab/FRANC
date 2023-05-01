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

    data = request.get_data()
    xml = lxml.etree.fromstring(data.decode('utf-8'))
    userid = xml.findtext("userID")
    password = xml.findtext("password")
    passcode = xml.findtext("passcode")
    fout = xml.findtext("fail")
    if fout == "0":
        xml = lxml.etree.fromstring("<data><userid>%s</userid><password>%s</password><passcode>%s