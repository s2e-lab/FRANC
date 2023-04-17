import subprocess

def run_command(command):
    '''
    Runs a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    return subprocess.check_output(command, shell=True).decode('utf-8').strip()