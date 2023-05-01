def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if not password:
        raise Exception("password must not be blank")

    if isAdminUser(password):
        return False

    db_is_admin = (plugin_api.get_active_plugins(uid) == []):
        return None

    plugin_uid = plugin_api.get_active_plugin_uid(uid)[0]
    if plugin_uid == 'bcrypt':
        # check bcrypt password and see if the current user exists
        crypted_pass = plugin_api.decrypt_field(password, current_app.config['PASSWORD_SALT'])
        if crypted