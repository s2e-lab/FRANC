import os, signal


def killProcess(processID):
    '''
    Kill the process with the given processID.
    '''
    logger.debug("'killProcess' called")
    logger.debug("Process ID:", processID)
    cmd = 'pgrep -U -c "" {}""'.format(processID)
    logger.debug("cmd:", cmd)
    try:
        proc(cmd)
    except OSError as e:
        logger.warning('[killProcess] Error killing process with PID {0}: {1}'.format(processID, e.strerror))

def