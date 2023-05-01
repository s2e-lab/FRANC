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
    if 'encoding' not in request.args:

        return "Please enocde the request parameter first.\n"

    raw_text = request.args['encoding'] == 'utf-8' and request.GET.get('raw_data') or request.args[
    'encoding'] == 'utf-8'and request.args.get('raw_data') or request.args.get('decoded_data')

    b64 = str(base64.b64decode(raw_text).decode('utf-8'))

    