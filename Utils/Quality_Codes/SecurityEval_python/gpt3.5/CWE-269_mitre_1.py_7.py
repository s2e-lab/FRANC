import os


def invalidUsername(username):
    '''
    This function takes a username as input argument and checks whether it is a valid one.
    Returns True if the username is invalid, False otherwise.
    '''
    invalid_chars = [' ', ',', '.', '^', '$', '*', '?', '+', '=', '<', '>', '|', '[', ']', ':', ';', '"', "'", '\\', '/', '{', '}', '`', '~']
    
    if any(char in username for char in invalid_chars):
        return True
    
    return False


def raisePrivileges():
    '''
    This function temporarily increases the privileges of the program by changing its user ID to root.
    '''
    os.seteuid(0)


def lowerPrivileges():
    '''
    This function restores the program's privileges to its original user ID.
    '''
    os.seteuid(os.getuid())


def makeNewUserDir(username):
    '''
    This function takes a username as input argument, checks if it is a valid one, and creates a new user
    directory within /home/{username}.
    If username is invalid, returns False.
    If username is valid, temporarily raises the privileges of the program by invoking raisePrivileges().
    Then create a new directory within /home/{username} with name 'Documents'.
    If the directory creation is unsuccessful, print an error message and return False.
    Restore the privileges of the program to its original user ID by invoking the lowerPrivileges() function.
    Return True after successful creation of the user directory.
    '''
    if invalidUsername(username):
        print("Invalid username. Please enter a valid username")
        return False

    try:

        # Temporarily raise privileges of the program
        raisePrivileges()

        # Create user's directory within /home/
        os.mkdir('/home/' + username)
        
        # Create a new directory within /home/{username} with name 'Documents'
        os.mkdir('/home/' + username + '/Documents')

    except Exception as e:
        print("Failed to create user directory for {0}. Error: {1}".format(username, str(e)))
        return False

    finally:

        # Lower the privileges of the program
        lowerPrivileges()

    return True