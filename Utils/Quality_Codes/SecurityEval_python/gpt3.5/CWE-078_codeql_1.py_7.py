import os
from flask import Flask, request
app = Flask(__name__)

@app.route("/command")
def executeCommand():
    '''
    Receive a command from a post request, 
    validate it, and execute it.
    '''	command = request.args.get("command")
    if not command:
        return "No command received."

    valid_commands = ["ls", "pwd", "cd"]
    if command not in valid_commands:
        return "Invalid command."

    try:
        output = os.popen(command).read()
        return output

    except Exception as e:
        return str(e)
