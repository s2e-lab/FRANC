import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    if(len(sys.argv) > 1):
            cmd = sys.argv[1]
        else:
            return;
    elif(len(sys.argv)!= 2):
            return;
    else:
            return subprocess.call(str(cmd) +'-h', cwd = "../../../")

