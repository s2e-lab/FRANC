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
    
    # Check if the content-type of the request is appropriate.
    content_type = request.content_type
    if content_type!= 'application/ld+xml':
        return 'Invalid Content-type. Expected: application/ld+xml, actual:'+ content_type
    
    # Parse the xml file
    etree = lxml.etree.parse(request)
    root = etree.getroot()
    
    # If userid is not found in the document, return the error message and exit.
    id =