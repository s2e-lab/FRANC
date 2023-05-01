import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    if type(processID) is not int:
        raise TypeError
    p = proc.Popen(["ps", "-E", "ProcessId={}".format(processID)],
                   stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True,
                   close_fds=True)
    p.communicate()
    p.wait()
