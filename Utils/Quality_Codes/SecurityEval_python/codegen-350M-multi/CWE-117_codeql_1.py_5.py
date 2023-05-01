from flask import Flask
from flask import request
import logging

logging.basicConfig(level=logging.DEBUG)

app = Flask(__name__)

@app.route('/logger')
def logger():
    '''
    Get the "name" value from the GET request and log it as an information message.
    '''
    message = request.headers.get('name', None);
    if message is not None:
        logging.debug("Requested name '%s'", message)
    else:
        logging.debug("Request not received for 'name' header")
    return message
        
@app.route('/logger/getuser/<username>')
