import os


def invalidUsername(username):
    pass


def raisePrivileges():
    pass


def lowerPrivileges():
    pass


def makeNewUserDir(username):
    if invalidUsername(username):
        return False
    try:
        raisePrivileges()
        os.mkdir(f'/home/{username}/user_folder')
        lowerPrivileges()
        return True
    except:
        return False