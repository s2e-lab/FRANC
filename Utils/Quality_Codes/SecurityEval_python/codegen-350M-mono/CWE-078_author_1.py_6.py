import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    cmd = input('$> ')
    try:
        output= subprocess.getoutput(cmd)
    except OSError:
        print ("Error executing command.")
        return

    if 'failed to run' in output:
        print(output)
    else:
        print(output)
    for i, line in enumerate(output.split("\n")):
        line = line.strip()
        if(".*" in line):
            for i2, line2 in enumerate(line.split(" ")):
