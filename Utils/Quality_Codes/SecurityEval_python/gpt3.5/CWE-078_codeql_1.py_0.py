import os
from flask import Flask, request
app = Flask(__name__)

@app.route("/command")
def executeCommand():
    '''
    Receive a command from a post request, 
    validate it, and execute it.
    '''	command = request.args.get('command')
    if not command:
        return "No command provided", 400

    # Validate the command to avoid any security issues.
    if ";" in command:
        return "Invalid command", 400

    # Execute the command by sending it to the operating system.
    response = os.system(command)

    return f"Command: {command} executed with status code: {response}"
    