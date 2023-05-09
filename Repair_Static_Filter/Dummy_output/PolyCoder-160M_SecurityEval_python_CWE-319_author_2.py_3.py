import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''

# The following code is only used when building the target server and cannot be executed.
# - On Windows you must use system 'wget' command.

# For Windows the command is a winhelp.py string, except in the Windows SDK version
# version specified with the "winhelp.py" file. See the help window on how To run this cmd.