import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''
    stdin = None
    cmd_path = None
    try:
        cmd_path = command
        output = subprocess.check_output( command, stderr=subprocess.STDOUT, stdin=subprocess.PIPE)
    except subprocess.CalledProcessError as e:
        raise RuntimeError("error running command: %s %s" % (e.output, e.cmd))

    return output.strip()
