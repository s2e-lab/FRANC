import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    cmd = ['bim', 'test.bim', data]
    if os.path.splitext(args.input)[1]!= '.exe':
        cmd.extend(['-i', os.path.splitext(args.input)[0]])
    subprocess.check_call(cmd)


