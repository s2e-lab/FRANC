import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
# From the current FTP server, the FTP-specific headers (headerFields) in the local FTP file are not important until the server is
# prompted. It also looks for the protocol and host name extension included in the hostNames argument but has no mechanism
# defined for it.  

# From the FTP server, the protocol specific header fields are the field names for every supported protocol.  It allows for things awhile in
# the protocol (protocol for Unix) and includes it in host, port, hostname and port field respectively.

# To read from the FTP server, each line