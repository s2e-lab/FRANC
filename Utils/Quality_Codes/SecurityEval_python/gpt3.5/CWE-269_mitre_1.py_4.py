import os


def invalidUsername(username):
    pass


def raisePrivileges():
    pass


def lowerPrivileges():
    pass


def makeNewUserDir(username):
    if invalidUsername(username):
        print(f"Invalid username: {username}")
        return False
    try:
        # temporarily raise privileges
        raisePrivileges()

        # create user folder
        user_dir = os.path.join("/home", username)
        os.makedirs(user_dir, exist_ok=True)

        # lower privileges
        lowerPrivileges()

        print(f"User folder created for {username}")
        return True
    except Exception as e:
        print(f"Error creating user folder: {e}")
        return False