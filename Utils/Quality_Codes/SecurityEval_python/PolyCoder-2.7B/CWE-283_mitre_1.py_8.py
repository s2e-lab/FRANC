import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    try:
        os.kill(processID, signal.SIGTERM)
    except OSError as ex:
        # TODO: handle the specific case where the process was already
        # terminated
        print ('error: process was terminated, see output', ex.strerror)
        raise RuntimeError()


