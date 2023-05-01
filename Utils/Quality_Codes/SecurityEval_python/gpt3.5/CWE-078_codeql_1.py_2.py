command = request.args.get('command')
    if not validate_command(command):
        return "Invalid command"

    result = os.popen(command).read()
    return result

