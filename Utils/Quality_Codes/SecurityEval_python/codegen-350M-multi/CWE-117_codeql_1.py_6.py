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
    if request.method == 'POST':
        username_value = request.form['username']

        try:
            result = login(username_value)
        except UnicodeDecodeError, e:
            error = {
               'subject': 'Error while processing request',
               'message': 'Could not decode credentials. Message: "%s" Error message: %s.' % (username_value, e),
               'response': None
            }
            return jsonify(error), 412
        if result == 1:
            return jsonify(message='Success