import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    import multiprocessing
    process_id = processID.decode('utf-8')
    pid = multiprocessing.get_process_id()
    pid = int(pid)

    # In windows we're actually running an instance of windows, so we'll
    # kill it in the child process. In linux the parent will not shutdown
    # the system properly so we need to kill instead.
    import signal
    if ((os.name == 'nt' and os