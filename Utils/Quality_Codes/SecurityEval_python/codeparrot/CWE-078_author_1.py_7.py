import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    command = raw_input(">> ")
    if command == '':
        return None
    command = command.lower()
    print("-- Executing command: {0}".format(command))
    process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    process.communicate()
    print(process.returncode)
    print("    Stdout: {0}".format(process.stdout.read()))
    return process.returncode

