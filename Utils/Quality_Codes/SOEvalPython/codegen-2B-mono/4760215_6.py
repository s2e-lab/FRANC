import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    return subprocess.run(command, shell=True, 
    stdout=subprocess.PIPE, stderr=subprocess.STDOUT).stdout.decode('utf-8')
