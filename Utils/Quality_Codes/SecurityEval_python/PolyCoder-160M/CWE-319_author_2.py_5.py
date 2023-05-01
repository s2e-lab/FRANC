import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    # use default ftp username for secure connection
    username = 'testusername'
    # default for username is user-password
    password = 'testpassword'
    username = os.path.split(username)[0]
    password = os.path.split(password)[0]
    filename = "file_info.csv"
    # print(username, username, password)
    # print("Filename", filename)
    # file_info, _ = getFTPInfo(