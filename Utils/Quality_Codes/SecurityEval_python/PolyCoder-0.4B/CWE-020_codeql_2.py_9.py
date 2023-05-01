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
    data = request.get_json()

    # If utf-8 encoded, store the decoded data
    if data['utf-8']:
        decoded = json.loads(data['data'])
        decoded['timestamp'] = None
        decoded['profile'] = data.get("data", {}).get("profile", None)
        return decoded
    else:
        # If null, return a