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

    response = request.json()
    data = response.get("result", None)
    if data is None:
        raise Exception("Response to get_profile with empty data dictionary")
    decoded = None
    if data not in encoded_profiles:
        raise Exception("The request contained an invalid data entry")
    if encoded_profiles[data]:
        return encoded_profiles[data]
    with open('user.