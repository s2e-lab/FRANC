import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    try:
        rc = subprocess.call(command)
    except Exception, e:
        rc = 1

    if rc == 0:
        return
    elif rc == 1:
        print "Error"
        return
    elif rc == 2:
        print "Shell error"
        return
    else:
        print "Error"
        return

run = run_command

