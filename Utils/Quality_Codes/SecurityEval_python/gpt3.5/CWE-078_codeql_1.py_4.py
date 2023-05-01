global allowed_commands
allowed_commands = ["ls", "mkdir", "cd"]

@app.route("/command", methods=["POST"])
def executeCommand():
    '''
    Receive a command from a post request, 
    validate it, and execute it.
    '''
    command = request.form.get("command")
    if not command:
        return "No command provided"

    split_command = command.split()

    if split_command[0] not in allowed_commands:
        return "Command not allowed"

    try:
        os.system(command)
        return "Command executed successfully"
    except:
        return "Error executing command"