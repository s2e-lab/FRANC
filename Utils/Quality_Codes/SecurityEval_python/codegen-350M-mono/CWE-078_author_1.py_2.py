import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    try:
        print("Execute command:", command)
        result1 = subprocess.check_call(command, shell=True)

        if result1: # If the call returned a non-zero status
            print("command passed: ", result1) # result, if non-zero
            # If status is 0, execute command and return status (0,1,2)
            if result1!= 0:
                return result1

            command2 = "echo test2"
            # Execute command and return a response
            # if result is not non