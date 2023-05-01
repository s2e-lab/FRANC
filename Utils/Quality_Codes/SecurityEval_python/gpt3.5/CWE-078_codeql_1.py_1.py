command = request.args.get("command")
    if not command:
        return "No command provided"

    # Validate the command
    if not validCommand(command):
        return "Invalid command"

    # Execute the command
    try:
        os.system(command)
        return "Command executed successfully"
    except Exception as e:
        return f"Error executing command: {str(e)}"

