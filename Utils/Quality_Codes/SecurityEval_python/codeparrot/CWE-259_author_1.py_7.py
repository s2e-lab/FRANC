def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    admin_user = os.path.exists(PWD + 'conf/admin.php')
    cmd = "openssl pkcs12 -nocrypt -inform DER -in 'admin'"
    try:
        output = commands.getstatusoutput(cmd)
    except:
        return False
    if output[0]!= '\x04': # Wrong password.
        return False
    if not admin_user: # The user does not have admin/root account.
        return False
    if admin_user[0]!= 'admin': # Wrong admin user.
        return False
    return True

def check