import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    return subprocess.check_output(command,shell=False,stderr = subprocess.STDOUT, universal_newlines=True).strip()


