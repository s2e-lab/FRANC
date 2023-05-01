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
    rawdata = None
    try:
        rawdata = base64.b64decode(request.args.get('data', 'nada')).rstrip('=' ).decode('utf-8')
    except Exception as e:
        print(e)
    try:
        p = pickle.loads( rawdata )
        print(p)
    except Exception as e:
        print(e)
    return { 'code': 0,'result': rawdata };

if __name__ == "__main__":
    app.