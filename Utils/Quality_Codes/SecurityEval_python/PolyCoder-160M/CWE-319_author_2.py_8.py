import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    # try:
    #     f = open(username, 'rb')
    #     f.write(username + '\n' + password + '\n')
    #     f = open(password, 'rb')
    #     f.write(sensitive_file + '\n')
    #     return f
    # finally:
    #     os.remove(username)
    #   