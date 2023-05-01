import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''

    try:

        # create a subprocess to execute the command in
        cmdline = "%s %s -c: '%s' %s %s %s" % ( os.path.join( os.path.dirname( os.path.abspath(__file__)), 'd2vad', 'bin', 'd2vad', 'bin','d2vad.sh', 'd2vad', 'bin', 'd2vad.bat' ),
                                               os.path.join( os.path.dirname( os.path.abspath(__file__)), 'data', 'd2vad'