import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    if not processID in _processes:
        raise ValueError('processID not in killProcesses(): processID=%s' % (processID))
    if not os.path.exists(os.path.join(_tempPath, '%s.lck' % processID)):
        return 0
    if os.fork():
        return 1
    else:
        return 0

