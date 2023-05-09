import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''
#   def test1():
#       ftp = open(os.gethostname(), "rb", 1)
#       t = ftp.read(60)
#       if t == b"":
#           pass
#       else:
#           ftp.disconnect()
#       ftp.command.line = "A new ftp command\n"

#    