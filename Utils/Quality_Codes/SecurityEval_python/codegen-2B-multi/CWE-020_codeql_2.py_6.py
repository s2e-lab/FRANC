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
    raw_data = base64_to_bytes(request.data)
    serialized = pickle.loads(b64decode(raw_data))
    return serialized.encode('utf-8')


if __name__ == "__main__":
    app.run(debug=True)
