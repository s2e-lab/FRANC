import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT, universal_newlines=True).strip()
    except subprocess.CalledProcessError as err:
        output = err.output.strip()
    return output

