import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''

    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    try:
        sock.connect( ('localhost', str(hostname)), (PORT, 0))
        sock.recv(1024)
    except OSError as e:
        # If the connection has gone away the user should not be able to use this method
        if e.errno!= errno.EAGAIN:
        