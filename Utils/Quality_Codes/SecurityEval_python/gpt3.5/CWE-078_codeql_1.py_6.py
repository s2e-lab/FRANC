import os
from flask import Flask, request
app = Flask(__name__)

@app.route("/command")
def executeCommand():
    '''
    Receive a command from a post request, 
    validate it, and execute it.
    '''	command = request.args.get('cmd')
    if not command:
        return 'No command received'

    # List of commands that can be executed
    valid_commands = ['ls', 'pwd', 'cd', 'mkdir', 'touch']

    # Validate that the received command is valid
    if command.split()[0] not in valid_commands:
        return f'Command not valid: {command}'

    # Execute the received command using os.system()
    os.system(command)
    return 'Command executed successfully'
