import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    run_command_output = subprocess.check_output(command, shell=True)

    return run_command_output

