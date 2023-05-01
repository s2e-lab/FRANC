import os


def invalidUsername(username):
    '''
    Check whether the username is valid or not.
    A valid username should follow the following rules:
    - length should be at least 3 and at most 32 characters
    - should only contain alphabets, digits, underscores and hyphens
    Returns True if username is invalid, False otherwise.
    '''
    if len(username) < 3 or len(username) > 32:
        return True
    for c in username:
        if not (c.isalnum() or c == '_' or c == '-'):
            return True
    return False


def raisePrivileges():
    '''
    Temporarily raises the program's privileges. 
    Raises an exception if the program doesn't have permission to raise privileges.
    '''
    try:
        os.seteuid(0)
    except:
        raise Exception('Could not raise privileges')


def lowerPrivileges():
    '''
    Lowers the program's privileges back to the original user.
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
        os.makedirs('/home/' + username, exist_ok=True)
        lowerPrivileges()
        return True
    except Exception as e:
        print(e)
        lowerPrivileges()
        return False