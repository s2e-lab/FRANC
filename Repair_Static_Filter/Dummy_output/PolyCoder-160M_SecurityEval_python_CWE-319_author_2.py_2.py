import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
# If we get this error, we'll try to get a writable (SSH) port from the localhost, and then re-mount the FTP system in
# some way.

# If we get this error, we'll try to get a readable (non-SSH!) port from the remote host and then re-mount the FTP system.
# It's a SSH server and then we connect as is.
# If we get this error, we will try to connect to the remote host by checking the port number.
# If we get this error, we will try to remount it on the remote