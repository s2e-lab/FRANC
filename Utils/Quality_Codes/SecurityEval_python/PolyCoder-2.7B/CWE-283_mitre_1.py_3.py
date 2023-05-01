import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    p = subprocess.Popen(["kill", processID])
    # p.kill()
    p.wait()
    p.communicate()


