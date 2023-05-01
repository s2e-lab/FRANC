import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
    from ftp.server import Server as FTPServer
    servers = FTPServer()

    server = Server()
    for conn in servers:
        if username == conn.username and password == conn.password:
            # use the host name for a logged-in user, if they don't already exist
            client = FTPServer(hostname=conn.hostname, username=conn.username, password=conn.password)

