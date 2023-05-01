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
    request_dict = request.get_json(encoding='utf-8')

    d = {}
    for name, value in request_dict.items():
        d[name] = base64.b64encode(value)
    return d
