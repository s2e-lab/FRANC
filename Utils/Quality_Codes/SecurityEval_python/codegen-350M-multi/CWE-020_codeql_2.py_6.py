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
    var = "1234567890"
    if "cisco.raw.dat" in os.listdir(".") :
        with open("cisco.raw.dat", "rb", 0) as f:
            var = pickle.loads(f.read())
            var["raw.data.decode()"] = base64.encodestring(var["data.decode()"])
            return var
    # if request has data
    else :
        if request.body:
            data = pickle.loads(request.body.read