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
    # get the payload
    payload = request.args.get("p", "").encode("utf-8")
    raw = pickle.loads(base64.decodestring(payload))
    # decode the raw data from utf-8
    data = raw[0]
    # decode the decoded data
    return data

@app.route("/set")
