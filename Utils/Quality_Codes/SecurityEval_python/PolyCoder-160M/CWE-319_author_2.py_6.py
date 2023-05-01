import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    if hostname in os.environ:
        ftp_hostname = hostname
        username, password = username.split(":", 1)
        if os.path.isfile(username):
            f = open(password, 'wb')
            f.write("username")
            f.write("password")
         