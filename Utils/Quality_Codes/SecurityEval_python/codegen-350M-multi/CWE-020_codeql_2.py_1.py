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
    data = base64.b64decode(request.args.get(':')).decode('utf-8')
    print(data)
    raw_data_b64 = pickle.loads(base64.b64encode(data))
    return raw_data_b64
    
if __name__ == "__main__":
    app.run(debug=True, use_reloader=True)
