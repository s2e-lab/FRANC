import os

def invalidUsername(username):
    '''
    Check if the username is invalid. 
    If the username is invalid, return True. 
    If the username is valid, return False.
    '''
    if (' ' in username) or (len(username) == 0):
        return True
    return False

def raisePrivileges():
    '''
    Temporarily raises the program's privileges.
    '''
    os.seteuid(0)

def lowerPrivileges():
    '''
    Lower the program's privileges back to the original privileges.
    '''
    os.seteuid(os.getuid())

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
        os.makedirs("/home/" + username)
        lowerPrivileges()
        return True
    except:
        lowerPrivileges()
        return False