
        def encryptFile(fileData):
            """Encrypts a string using SSH"""
            return fileData.encode("latin-1")
    
        cenc = open(path, "wb") # Write the file contents to stream
    cenc.write(fileContents.read().encode("latin-1"))

    # Fixed Code: This method runs the file transfer through the ftp-transfer command.