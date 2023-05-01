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
    print(request.get_json().decode('utf-8'))
    return base64.decodebytes(request.get_json().decode('utf-8').decode('utf-8'))

app.run(debug=True)


# GET profile

app.get('/', lambda x=None: pickle.dumps(x))