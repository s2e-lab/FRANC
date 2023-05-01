import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    # We get an FTP instance.
    ftp = open(os.gethostname(), "rb")
    host = ftp.hostname
    path = os.path.join(username, password)
    path = os.path.join(path, path.encode("UTF-8"))
    d = os.path.dirname(__file__)

    # Extract the file contents.
    fileContents = open(path, "rb")
    fileContents.seek(0)
   