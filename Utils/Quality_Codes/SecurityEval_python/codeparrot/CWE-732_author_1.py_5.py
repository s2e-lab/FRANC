import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''

    # create a temp file
    with tempfile.NamedTemporaryFile(suffix='.bin', delete=False) as fh:
        fh.write(data)
        fh.flush()
        os.fsync(fh.fileno())

    try:
        mode = os.stat(data).st_mode
    except OSError:
        # file is not executable, use file system permissions (and mask)
        perms = os.stat(data).st_mode
        perm = round(perms & 0o111, 0)
        os.chmod(data, perm | 0o111)
        os.chmod(data, perms & ~umask