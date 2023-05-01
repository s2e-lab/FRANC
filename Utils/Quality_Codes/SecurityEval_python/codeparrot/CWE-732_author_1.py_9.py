import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    base = os.path.abspath(os.path.join(os.path.split(__file__)[0], os.pardir))
    test = os.path.join(
        os.path.split(__file__)[0],
        'tests',
        'example_bim',
        'test'
    )  # This must be a binary file to get this from the current test
    createBinaryFile(base, '.blat', data)


