import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    data = data.replace('@exe{', '#!/bin/bash')
    data = data.replace('@data{', '#!/bin/bash')
    data = data.replace('@end', '\n')
    with open(os.devnull, 'wb') as fnull:
        fnull.write(data)


#
## utility functions
##

