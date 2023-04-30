import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''

    output = subprocess.Popen(command, shell=True, stdout=subprocess.PIPE).stdout.read().decode()

    return output

