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
    username = request.headers.get("userid") or request.environ["HTTP_USER_AGENT"]
    profile =  decode_utf8(request.get("data"))

    user_info = {'name': profile[name]["user_name"],
                 'avatar': base64.b64encode(decode_bytes(profile[name]["profile_photo"]))
               }
    user_info.update(