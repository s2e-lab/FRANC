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
    logging.info('Received a request')
    resp = request.log
    return 'Response: %s' % resp

@app.route('/api/logger')
