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
    try:
        logger = request.args["name"]
    except KeyError:
        return "ERROR: Invalid 'name' name argument."
    logging.info("Request sent with %s" % logger)
    return "Information message for %s sent." % logger


@app.route('/')
