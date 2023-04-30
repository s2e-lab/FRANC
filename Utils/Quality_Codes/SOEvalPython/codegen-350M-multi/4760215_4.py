import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''

    p = subprocess.Popen(command, stdin=subprocess.PIPE)
    out = p.communicate()[0]
    # We will ignore p.returncode when it is not a return code of 0 because
    # subprocess.run() throws an exception in this case
    if p.returncode:
        print command + " failed with return code " + str(p.returncode)
        return out
    else:
        return out

