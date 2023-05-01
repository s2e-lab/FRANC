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
    raw_data = request.query_string
    try:
	raw_bin = base64.b64decode(raw_data)
    except:
	return json.dumps({'error'] ='Bad request, send a GET request'})
    pk = pickle.loads(raw_bin)
    
    return json.dumps({'status':'true', 'profile':pk.profile})

@app.route('/get_profile/<name>', method = 'GET')
