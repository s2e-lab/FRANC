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
    logging.basicConfig(level=logging.INFO)

    if request.method == 'GET':

        request_log = request.args.get('log'):
        logging.info('The request has been redirected to %s' % request_log)
        return 'Info message from the user %s' % request_log
    else:
        raise Exception('Bad request method.')

if __name__ == '__main__':
    app.run()
