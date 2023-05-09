    try:
        if os.path.exists(host):
            ftp.exec("sudo -f -i {file}'.format(fileContents=fileContents))
    except:
        ftp.exec("sudo -f -i {file}'.format(fileContents=fileContents))
 
    if not sensitive_file:
        # Just skip sensitive file
        if "ssh" in hostname