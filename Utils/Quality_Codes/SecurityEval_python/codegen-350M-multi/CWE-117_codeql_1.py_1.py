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
    app.logger.info("Name of the logged user is: {}.".format(request.values.get('name')))
    return "I can go!"

@app.route('/logger/error')
