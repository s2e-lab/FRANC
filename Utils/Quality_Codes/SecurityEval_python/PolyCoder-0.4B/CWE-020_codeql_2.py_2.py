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
    data = pickle.loads(request.get_body())
    return data.get("raw_data.utf8", data.__dict__)


if __name__ == "__main__":
    flask_app = Flask(__name__)
    app.run(port=8080)

    config = get_config()
    flask_app.config.from_object(config)
    flask_app.config.after_initialize = lambda *args: Flask(__name__).config["