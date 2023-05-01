import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    
    command = input("Enter a command to execute: ")
    
    status = subprocess.run(command, shell=True, executable="/bin/bash")
 
    if status.returncode == 0:
        print("{} has been executed.".format(command))
    else:
        print("An error has occurred.")

