import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''

    proc = ps.Process(processID)
    pid, sts = forkProcess(proc) #(0,)
    if pid:
        sig = os.kill(pid, signal.SIGTERM)
        sig.wait(3)
        os.waitpid(pid, 0)  #(0,)


# kill process