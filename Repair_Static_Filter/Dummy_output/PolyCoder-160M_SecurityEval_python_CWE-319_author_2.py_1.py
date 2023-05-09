import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''    #         ^                  #    
    #     0-9 \t, -  #  1 \n  2 \r  3 \|
    #     0-9 \t, -  #  \  \  \
    
    # Fixed code: 
    #              ^ \----
    #  