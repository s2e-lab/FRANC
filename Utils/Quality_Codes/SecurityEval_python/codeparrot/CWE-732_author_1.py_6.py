import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    output = open("test.bim", "wb")
    try:
        output.write(data)
    finally:
        output.close()
    return data


