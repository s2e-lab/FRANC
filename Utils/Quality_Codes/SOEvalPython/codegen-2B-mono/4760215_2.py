import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    p = subprocess.Popen(command, stdout=subprocess.PIPE, shell=True)
    output, error = p.communicate()
    output = output.decode('utf-8')
    return output

