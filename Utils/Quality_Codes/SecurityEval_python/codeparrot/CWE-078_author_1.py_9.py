import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    c = subprocess.Popen(['bash', '-c', ''], stdout=subprocess.PIPE)
    cmd = c.communicate()
    print('Command: %s' % str(cmd))
    return cmd[0]

