
'''
        Check if the userid and password are correct by invoking checkPassword().
        '''
    userid = int(request.body)
    password = int(request.body.decode('utf-8'))
    xml = request.json["upload"]["xml"][userid].encode("utf-8")
    checkPassword(userid, password)

    return xml
'''
        
    @app.callback("error", lambda _: raise