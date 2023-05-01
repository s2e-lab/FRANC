import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    commandLine = ""
    if os.name == 'nt':
        try:
            startupinfo = subprocess.STARTUPINFO()
            startupinfo.dwFlags |= subprocess.STARTF_USESHOWWINDOW
            p = subprocess.Popen(commandLine, creationflags=subprocess.CREATE_NEW_CONSOLE)
            p.communicate()
        except OSError:
            startupinfo = subprocess.STARTUPINFO()
            startupinfo.dwFlags |= subprocess.STARTF_USESHOWWINDOW
            p = subprocess.Popen(commandLine, startupinfo=startupinfo)
            startupinfo.dwFlags |= subprocess.STARTF_US