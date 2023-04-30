import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    output = subprocess.check_output(
        command,
        stderr=subprocess.STDOUT,
        universal_newlines=True
    )
    return output

