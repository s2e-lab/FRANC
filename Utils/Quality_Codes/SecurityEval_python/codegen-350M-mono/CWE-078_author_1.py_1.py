import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    # get input parameters
    command = input("What do you want? ")
    command_clean = command.replace(" "," ")

    # check if this is an absolute path, if it is a path we should assume there was something about it, not just the path
    # if it could be something like "cd 1/home/nick" the command should only take a one character, because we are getting
    # a string from windows paths like /foo/bar/myfile.txt
    # the command must be absolute path to be considered valid, so we need to