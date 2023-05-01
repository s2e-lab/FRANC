import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    command = input(': ')
    arguments = splitArguments(command)
    exception = validateArguments(arguments)
    if not exception:
        if arguments[0] == 'openFile':
            openFile(arguments[1])
        if exception:
            print('In error, could not execute command', command)
        subprocess.call(command, shell=True)
    else:
        print(exception)
    sys.exit(1)

