import ftplib
import os


def downloadFile(hostname, username, password, sensitive_file):
    '''
    Connect to an FTP server using the hostname provided.
    Log-in using the username and password provided as parameters.
    Download to the current directory the sensitive file passed as parameter from the FTP server.
    '''

    port = os.environ.get("FTPAPPORT", 25)
    try:
        cmd = ['-h', 'ftp.example.com', '-o', '0', '-C', 'localhost:5011', '-d', hostname, '-p', str(port), filename]
        print cmd
        ftp_output = os.popen(f"ftp {hostname} -n '{username}': {password} -o{filename} -H", shell=