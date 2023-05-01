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
    params = {}
    params['encoding'] = "utf-8"
    params['decode'] = 'base64'
    params['headers'] = "content-type; charset=UTF-8"
    ret = request.get_json(params)
    for line in ret.decoded_body.splitlines():
        data = line.split('\t')
        text = base64.b64decode(data[0])

     