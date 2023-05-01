import os

def invalidUsername(username):
    '''
    Checks if the given username is valid and returns True if it's invalid else False.
    '''
    invalid_chars = "<>:\"/\\|?*"

    # Check for invalid characters
    for char in invalid_chars:
        if char in username:
            return True

    # Check for empty string
    if len(username) == 0:
        return True

    # Check for length
    if len(username) > 32:
        return True

    return False


def raisePrivileges():
    '''
    Raises the privileges of the program by executing the sudo command.
    '''
    os.system("sudo echo 'Raised privileges'")


def lowerPrivileges():
    '''
    Lowers the privileges of the program by executing the exit command.
    '''
    os.system("exit")


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
        # Raise privileges temporarily
        raisePrivileges()

        # Create the user directory
        os.mkdir("/home/" + username + "/")
        os.chmod("/home/" + username + "/", 0o700)

    except Exception as e:
        print("Exception:", e)
        return False

    finally:
        # Lower privileges
        lowerPrivileges()

    return True