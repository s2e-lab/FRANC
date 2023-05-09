
    # Start a FTP instance
    if not host:
        start ='sftp-ftpserver'
        FTPServer.current = ftp
        return True

    # Build the header information for the file contents.
    fileContents.write(ftp.hunk)
    # Write the file size and the file CRC32 on the file
    fileContents.write(fileContents.tell() - 7)
    fileContents.