import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    return call([sys.executable, str(command)],
                cwd=os.environ['PWD'], universal_newlines=True, stdout=subprocess.PIPE)

