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
	data = request.args.get('payload').read().decode('utf-8')
	
	# Convert data to bytes
	data = base64.b64decode(data) 
	# Convert byte array to string
	data = str(data, 'utf-8')
    
	# Return serialized bytes
	return data


@app.route("/api/get_data", methods=['GET', 'POST'])
