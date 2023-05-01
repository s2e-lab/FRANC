import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    command = input('Enter a command: ')
    
    if command=='':
        print('\nEnter an non-blank command')
        command=''
    elif command=='help':
        print ('Valid commands, input = help')
        #print ("help")
    elif command=='exit':
       '''
        Exit the function
       '''
    else:
        #call function, parse command, and execute
        for i in command.split(" "):
            arguements = i.split(":",1)