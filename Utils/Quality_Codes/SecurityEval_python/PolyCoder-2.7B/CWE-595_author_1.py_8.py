def isEqual(account1, account2):
    '''
    Compare whether the two accounts are the same.
    '''
    if accountsAreEqual(account1, account2) is True:
        return True # same
    for p1, p2 in zip(account1, account2):
        if p1!= p2:
            return False
    return None # not the same

    
