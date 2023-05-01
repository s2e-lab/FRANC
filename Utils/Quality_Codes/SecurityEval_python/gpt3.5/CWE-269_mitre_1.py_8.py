import os


def invalidUsername(username):
    '''
    Check whether the username is valid or not. 
    A username is considered valid only if it has length greater than 0 and doesn't contain spaces.
    If username is invalid, return True, else False.
    '''
    if len(username) == 0 or ' ' in username:
        return True
    return False


def raisePrivileges():
    '''
    Temporarily raises the program's privileges to superuser/administrator by invoking `sudo` command.
    '''
    os.system('sudo -s')


def lowerPrivileges():
    '''
    Restore the program's privileges to normal user privileges by invoking `exit` command.
    '''
    os.system('exit')


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
        # temporarily raise privileges
        raisePrivileges()

        # create new user directory 
        os.makedirs('/home/{}'.format(username), exist_ok=True)

        # restore privileges 
        lowerPrivileges()
        
        return True
    
    except:
        return False