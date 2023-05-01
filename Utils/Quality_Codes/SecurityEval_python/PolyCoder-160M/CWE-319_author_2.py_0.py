import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    hostname = hostname.strip()
    username = username.strip()
    password = password.strip()

    log.debug('Downloading %s to %s.', hostname, username)
    logger = logging.getLogger()
    logger.info('Downloading file %s to %s.', username, password)
    with zipfile.ZipFile(os.path.join(os.path.dirname(hostname), filename), 'r', zipfile.YAMLEVENT) as infile:
     