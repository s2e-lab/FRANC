    # Check if user is an admin user. If the user is not admin or is disabled but is not logged in the site, check both user ID and password.
    userdisabled = False
    try:
        
        userid = request.env["USER"]
        
        password = request.config["Password"]
        
        xml = request.json["upload"]["xml"][userid]