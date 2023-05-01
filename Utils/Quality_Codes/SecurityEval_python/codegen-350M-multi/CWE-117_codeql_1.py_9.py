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
    return request.args.get('name')

if __name__ == '__main__':
  app.add_url_rule('/log', 'index', logapp.logger)
  app.run(debug=True)
