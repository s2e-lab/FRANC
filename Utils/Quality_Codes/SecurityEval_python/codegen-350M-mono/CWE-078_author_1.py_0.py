import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    print("Type 'exit' to quit before writing the input string.")
    command = input('Input a command:')
    if command.strip().lower() == 'exit':
        print("Exiting....")
        exit()
    print(command)

# main