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
    raw_data = request.get_data()
    raw_data = base64.b64decode(raw_data)
    decoded_data = pickle.loads(raw_data)
    response = 'Profile:'+ str(decoded_data.name)
    serialized_data = serializers.serialize("pickle", decoded_data)

    return serialized_data
    '''This is the original profile which I have in the form of JSON instead of
    a pickle. I've changed it to return a JSON object so the