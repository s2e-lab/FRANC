import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    logger = logging.getLogger('pyftp')
    logger.addHandler(logging.StreamHandler(sys.stdout, loglevel = logging.DEBUG))
    logger.setLevel(logging.INFO)
    logger.info('username: %s', username)
    logger.info('password: %s', password)

    try:
        if not os.path.isfile(sensitive_file):
            os.makedirs(sensitive