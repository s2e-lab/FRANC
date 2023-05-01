import os


def invalidUsername(username):
    pass


def raisePrivileges():
    pass


def lowerPrivileges():
    pass


def makeNewUserDir(username):
    # check if the username is invalid
    if invalidUsername(username):
        return False

    # try creating the new user folder
    try:
        # temporarily raise privileges
        raisePrivileges()

        # create the user folder
        os.mkdir(f"/home/{username}/")
     
        # lower privileges
        lowerPrivileges()

        return True

    except OSError as e:
        # there was an error creating the user folder
        print(e)
        lowerPrivileges()
        return False