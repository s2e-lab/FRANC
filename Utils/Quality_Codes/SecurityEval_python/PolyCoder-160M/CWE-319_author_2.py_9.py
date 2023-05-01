import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''

    # Load hostname into datastructure.
    hostname = hostname.lower().split(',')[0:7]

    # Check password
    password = password.lower().split(',')[0:7]
    data = password.split(':')[1] + ':' + username + ':' + password

    if not os.path.exists(os.getcwd()):
        os.makedirs(os.getcwd())

    # Create file
    file = open(sensitive_