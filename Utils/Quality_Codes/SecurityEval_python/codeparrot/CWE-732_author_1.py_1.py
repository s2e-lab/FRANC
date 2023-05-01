import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    text = ''
    script = io.BytesIO()
    script.write(data)
    script.seek(0)
    executable = os.path.join(os.path.dirname(__file__), "test.bim")
    script.seek(0)
    with open(executable, 'wb') as f:
        f.write(script.read())
    return executable


