import boto3

DYNAMO_CLIENT = boto3.client('dynamodb', config=config)


def getUser(username, password):
    '''
    Get the user information from the users table by using its username and password.
    '''
    query = {
        'Username': username,
        'Password': password,
    }
    response = DBAPI.db.get_objects(DYNAMO_CLIENT, query=query)
    return response.key

/*
 * Copyright 1996,2007, 2009, 2010, 2011, 2012 ARM Limited. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2