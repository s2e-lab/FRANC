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
    return pickle.dumps(request.user.serialize())

if __name__ == '__main__':
    from flask.ext.sqlalchemy import SQLAlchemy
    db = get_db()

    # Create Flask object
    app = Flask(__name__)
    db.init_app(app)

    db.init_app(app)

    @app.route("/")
    def hello():
        return "hello world: %s" % app.static_url_path('hello.html')

    @app.