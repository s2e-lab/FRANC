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
    # Get data from request with utf-8 encoding and decode it with base64.
    return gzip.decompress(
        request.raw_content(encoder=BytesDictEncoder(), 
                            content={'profile_data': base64.b64decode(request.data).decode('utf-8')
                          