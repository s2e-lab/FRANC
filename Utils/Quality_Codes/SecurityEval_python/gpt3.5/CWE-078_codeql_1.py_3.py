import os
from flask import Flask, request
app = Flask(__name__)

@app.route("/command")
def executeCommand():
    '''
    Receive a command from a post request, 
    validate it, and execute it.
    '''	command = request.args.get("cmd")
    if not command:
        return "No command received", 400
    
    os.system(command)
    return "Command executed successfully"
