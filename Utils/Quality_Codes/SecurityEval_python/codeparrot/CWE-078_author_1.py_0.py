import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    cmd_output = subprocess.check_output(
        ['env',
        CONFIG_PATH + '/git/name-of-the-repo',
        'pull@{0}'.format(CONFIG_REPO_SLUG),
        'tags',
        '--force'],
        stderr=subprocess.STDOUT
    )

    if cmd_output.returncode!= 0:
        print('ERROR: command execution failed')
        print('You can use "--force" to continue.')
    else:
        commit = cmd_output.stdout.decode().rstrip('\n')

    subprocess.check_output(
        ['git', 'push', 'origin