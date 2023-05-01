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
