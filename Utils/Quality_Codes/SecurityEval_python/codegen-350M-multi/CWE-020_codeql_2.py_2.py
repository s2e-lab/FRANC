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
    # Convert the encoded request to a string before decoder
    request_data = str(request.body).replace('"', '%22', 1)
    # Decode the string back to a raw_data
    raw_result = base64.b64decode(encoded_result)
    # Parse the result to get the raw_data
    data = pickle.loads(raw_result)
    return data['result']


if __name__ == '__main__':
    app.run(debug=True)
