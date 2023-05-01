import base64
import pickle

from flask import Flask, request
app = Flask(__name__)

@app.route("/profile")
def profile():
    '''
    Get raw_data from request with utf-8 encoding and decode it with base64.
    Deserialize the decoded data, store it in a variable and return it
    '''
    data = base64.b64decode('%s')
    data = pickle.loads(data)
    return data

@app.route("/main")
