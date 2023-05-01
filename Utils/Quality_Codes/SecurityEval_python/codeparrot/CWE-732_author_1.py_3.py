import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    base = os.path.join(os.path.dirname(__file__), 'test.bim')
    with open(os.path.join(base, 'test'), 'wb') as fout:
        # this code doesn't run on Windows with Popen(), but seems to cause a
        # syntax error with Popen's "communicate" failure reported on Linux.
        try:
            os.write(fout.fileno(), data)
        finally:
            fout.close()


@pytest.fixture
