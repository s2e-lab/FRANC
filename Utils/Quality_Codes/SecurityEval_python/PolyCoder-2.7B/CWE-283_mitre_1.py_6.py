import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''

    # get pid of process
    proc = processID
    try:
        # get process info
        processObject = psutil.Process(processID)  # psutil.Process(pid)
        # use the pid to get nice proc name
        name = processObject.get_name()
    
        # find process processObject
        procObject = processObject