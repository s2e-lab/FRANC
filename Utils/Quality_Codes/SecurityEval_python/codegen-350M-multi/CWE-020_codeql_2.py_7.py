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
    # encode
    raw = request.args.get('payload').encode('utf-8')
    base64 = base64.encode(raw)

    response = (
        "This is my profile data:") + " " + "".join(
            f'\n!{item}{chars}' for item,chars in zip(base64lines[::2],base64chars[::2]))

    return response

@app.route("/pay")
