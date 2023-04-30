import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    p = subprocess.Popen(command)
    output = p.communicate()
    if p.returncode:
        raise Exception('Failed {}: {}'.format(command, output))

    if p.returncode!= 0:
        return 'Failed {}'.format(command)

    return ''.join(output[0].decode() for line in output[1]) 

