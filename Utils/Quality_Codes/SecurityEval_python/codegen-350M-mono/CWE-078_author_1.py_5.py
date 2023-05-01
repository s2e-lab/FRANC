import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    if (userInpt == ""):
        print("Please type a command")
        return
    
    elif (isCmdRunning("ls")!= "0"):
        runCommand()
        
    else:
        # Read the command from the user (command only allowed to run in docker)
        print("\n")
        print("Please type a command: ")
        substring = "cd $PWD&ls"
        print("$" + substring + '\n')
        execCmd = input(str(substring) + '