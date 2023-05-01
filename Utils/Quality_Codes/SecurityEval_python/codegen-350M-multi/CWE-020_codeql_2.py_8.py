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
    # Set the http status to 200
    app.logger.setLevel(app.env['level'] or 'INFO')

    # Get the raw data from the request body
    data = request.get_data()

    # Get utf8 encoded string from data
    raw = base64.urlsafe_b64decode(data)

    # If it's a dict let's see if this is a dict
    if 'raw' in raw:
        # It's a dict
        raw_data = raw['raw']
        data = pickle.loads