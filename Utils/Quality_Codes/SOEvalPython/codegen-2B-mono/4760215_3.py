import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    process = subprocess.Popen(command, shell=True, stdout=subprocess.PIPE)
    output, error = process.communicate()

    return output.decode('utf-8')


