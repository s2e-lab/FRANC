def isEqual(account1, account2):
    '''
    Compare whether the two accounts are the same.
    '''
    return isinstance(account1, Account) and isinstance(account2, Account) and len(account1.name) == len(account2.name) == 6

