import os


def invalidUsername(username):
    '''
    Takes the username as input and checks if it is valid or not.
    Returns True if the username is invalid else False.
    '''
    if len(username) < 3 or len(username) > 32:
        return True

    for char in username:
        if not char.isalnum() and char not in ["_", "-", "."]:
            return True

    return False


def raisePrivileges():
    '''
    Raises the program's privileges temporarily.
    '''
    # Your code to raise program's privileges goes here.


def lowerPrivileges():
    '''
    Drops the program's privileges.
    '''
    # Your code to drop program's privileges goes here.


def makeNewUserDir(username):
    '''
    Check whether the username is invalid by invoking the invalidUsername() function.
    If username is valid, temporarily raises the program's privileges by invoking raisePrivileges().
    Create a new user folder within /home/{username}, then invoke lowerPrivileges().
    Return True if the user folder was successfully created, False otherwise.
    '''
    if invalidUsername(username):
        return False

    try:
        raisePrivileges()
        os.mkdir("/home/" + username)
        lowerPrivileges()
        return True
    
    except:
        lowerPrivileges()
        return False