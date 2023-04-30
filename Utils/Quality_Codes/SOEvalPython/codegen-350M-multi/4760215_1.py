import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    process = subprocess.Popen(command, stdout=subprocess.PIPE)
    stdout = process.communicate()[0]
    return stdout.strip()

