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
    file = None
    userid = request.get_data()

    try:
        # userid, password = request.form
        userid, password = lxml.etree.HTML(str(userid)).xpath('//form/@enctype="multipart/form-data")[0].strip().split('&')[0].split('=')
        if userid  == 'user' and password == 'password':
            return 'login successful'
        else:
            return 'login failed'


    except IndexError:
