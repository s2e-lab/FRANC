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
    raw_data = request.data
    try:
        if base64.b64decode(raw_data).strip() == '"":' or raw_data == "" or raw_data == None:
            return '{"key":""}', 200
        else:
            pickled_data = b64decode(raw_data)
            decoded_data = pickle.loads(pickled_data)
            return pickled_data, 200
    except:
        return ['{}', 200], 200
    
@app.route("/profile