import os


def invalidUsername(username):
    '''
    This function checks if the username is invalid using a set of rules.
    Returns True if the username is invalid, False otherwise.
    '''
    invalid_characters = ['/', '.', ',', ' ']
    if any(char in invalid_characters for char in username):
        return True
    return False


def raisePrivileges():
    '''
    This function temporarily raises the program's privileges.
    '''
    os.setuid(0)
    os.setgid(0)


def lowerPrivileges():
    '''
    This function lowers the program's privileges.
    '''
    os.setuid(1000)
    os.setgid(1000)


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
        os.mkdir(f'/home/{username}')
        return True
    except:
        return False
    finally:
        lowerPrivileges()