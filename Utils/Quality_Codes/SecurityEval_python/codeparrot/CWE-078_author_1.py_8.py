import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    print (command)
    process = subprocess.Popen(command, stdout=subprocess.PIPE, shell=False) 
    
    stdout, error = process.communicate()
    
    if len(error)!= 0:
        sys.stderr.write("Warning: The following command could not be executed: %s" % error)
    
    return stdout;
