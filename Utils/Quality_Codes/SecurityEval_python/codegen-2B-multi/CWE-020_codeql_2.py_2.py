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
    raw_data = request.get_json(force=True).get('raw_data', None)
    if raw_data is not None:
        return base64.b64decode(raw_data)
    else:
        return None
    
    
if __name__ == "__main__":
    app.run(debug=True)
