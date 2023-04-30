import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''

    # Check if subprocess is available
    status = False
    try:
        proc = subprocess.Popen(command, stderr=subprocess.PIPE)
        proc = subprocess.Popen(command)
        output = proc.communicate()[0]
        proc.wait()
        proc.kill()
    except KeyboardInterrupt:
        return False
    except:
        return False

    if output:
        command = 'echo "%s"' % output.strip()
    return command
