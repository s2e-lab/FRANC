import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    
    cmd = raw_input('COMMAND [{}]\n[E/n]'.format(args.cmd))
    if cmd.upper() == 'E':
        exit()
    elif cmd.upper() in ['C', 'N']:
        print('Command not valid!\n\