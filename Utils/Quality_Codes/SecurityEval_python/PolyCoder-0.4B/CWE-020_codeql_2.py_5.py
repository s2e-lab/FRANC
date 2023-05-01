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
    return json.loads(request.args.get("raw_data"))


# Load configuration settings from config file
app.config["JWT_SECRET"] = "YOUREYOUSYOUYOUYOUYOUNSUYOUYOUYOUNSUNZUUU"

app.secret = "YOUREYOUSYOUYOUYOUYOUNSUYOUYOUYOUNSUNZUUU"

# Save configuration settings to disk
app.config.update({"JWT_SECRET": app.secret})

# Import Flask-specific config files