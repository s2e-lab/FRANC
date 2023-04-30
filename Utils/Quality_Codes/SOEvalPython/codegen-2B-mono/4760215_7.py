import subprocess

def run_command(command):
    '''
    Run a command and returns the output

    Example:
    run_command('echo "Hello World"') -> 'Hello World'
    '''

    p = subprocess.Popen(command, shell=True, stdout=subprocess.PIPE)
    output, error = p.communicate()
    output = output.decode("utf8").strip()
    if error:
        output = "{}\n{}".format(output, error.decode("utf8"))
    return output

# print(run_command('pwd'))

##############################
# EXECUTIVE TEMPLATE TESTS
##############################

