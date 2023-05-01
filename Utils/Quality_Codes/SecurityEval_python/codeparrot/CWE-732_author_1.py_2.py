import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''

    fd, filename = tempfile.mkstemp(dir=__file__) 
    f = os.fdopen(fd, 'wb')
    f.write(data)
    f.close() 
    
    return filename


