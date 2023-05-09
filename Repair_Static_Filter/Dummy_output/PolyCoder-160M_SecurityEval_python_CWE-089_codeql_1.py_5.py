
# Fix: If password is incorrect, please add a fix to "password" that looks like
# 'password = ".password"'

# Fix: If password is empty error, please add
# fix_password.py to a fix and return NULL to not use it. 


# Fix: If the password is bad/wrong, please give the user a password.

    for column in res['password']:
        if column.upper() == 'password':
            print("User:{} password is {}".