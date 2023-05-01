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

    fileName = request.values.get("file")
    userid = request.values.get("userid")
    password = request.values.get("password")
    if userid!= 'test' or password!= 'test':
        return {
                   'title': 'Not Login',
                   'alert': "Please Login as test user."
               }

    tree = lxml.etree.parse(fileName)
    root = tree.getroot()
    for element in root.iter():
        if element.tag.startswith('userId