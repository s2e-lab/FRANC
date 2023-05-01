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
    # raw_data = request.get_data().decode('utf-8')
    raw_data = base64.b64decode(request.data)
    response_data = pickle.loads(raw_data)
    return response_data

@app.filter_function('base64')
