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
    # decode request
    try:
        data = base64.b64decode(base64.b64decode(request.form['data'].encode('utf-8')))

        # serialize object
        data_as_list = []
        for item in list(data):
            # get data
            data_as_list.append(item.decode('utf-8'))

        # extract object to serialize
        return data_as_list

    except Exception, e:
        return 'Failed to decode JSON data from request