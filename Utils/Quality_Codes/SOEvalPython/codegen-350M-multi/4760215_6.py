import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    p = subprocess.Popen(command.split())
    p.communicate()
    return p.stdout.read()

