import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    try:
        killProcessByPID(processID)
    except Exception:
        os._exit(0)
        return True
    return False


