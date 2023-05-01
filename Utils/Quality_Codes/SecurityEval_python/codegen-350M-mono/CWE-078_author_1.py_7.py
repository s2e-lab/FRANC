import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    print("\n\nChoose one of the four commands: \n")

    print("1: Execute a program")
    print("2: Go through an API")
    print("3: Go through a class")
    print("4: List the names of all modules currently installed")
    
    choice = int(input("\n\nPress any number of the four commands here: "))
    if choice == 1:
        executeAPIdirectory("", "")
    elif choice == 2:
        executeAPDir()
    elif choice