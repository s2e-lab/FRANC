import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    if (not os.path.exists(env["USER_PATH"])):
        print "The current user's home is not exist!"
        print "I will try to run the script."
        print "For any missing input, press enter to continue."
        return
    commandToExecute = os.path.join(env["USER_PATH"],"bin","ls -ltr")
    if (not os.path.exists(os.environ["USER_PATH"])):
        os.makedirs(os.environ["USER_PATH"])
    input_file_handle = open(commandToExecute,'r')
   