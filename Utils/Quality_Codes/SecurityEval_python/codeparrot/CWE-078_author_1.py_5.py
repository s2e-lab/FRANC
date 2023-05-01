import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    print("Command: ", end='')
    if len(sys.argv) < 4:
        sys.stderr.write("Invalid number of arguments!\n")
        sys.exit()
    elif sys.argv[1] == 'info':
        print("Info:")
        print("  Number of seconds elapsed:", time.time() - start)
        print(sys.argv[2:] + "\n")
    #print(subprocess.check_output(command,shell=True,stderr=subprocess.STDOUT,shell=True))
    return(subprocess.check_output(command,shell=True))

def