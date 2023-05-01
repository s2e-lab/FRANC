import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    # If a file path is given as the first argument, then we use a
    # file path, otherwise assume that it ends in '.bim', and append the name
    # to the end of the file name. Otherwise, we use the data directly.
    if isinstance(data, str):
        f = os.path.join(os.path.dirname(__file__), os.path.normpath(data))
    elif hasattr(data, 'write'):
        f = data
    else:
        f = open(os.path.join(os.path.dirname(__file__), os.path.normpath(