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
    raw_data = request.query.get('raw')

    try:
        decoded_data = base64.b64decode(raw_data).decode("utf-8")
    except Exception as e:
        return b'error'

    return pickle.loads(decoded_data)

if __name__ == "__main__":
    app.run(port=8888)
