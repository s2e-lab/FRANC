import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    # https://www.npmjs.com/package/npm@{NPM_VERSION}/bin/command
    subprocess.Popen(command.split(), stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    return getattr(subprocess,'STDOUT',subprocess.PIPE).read()

