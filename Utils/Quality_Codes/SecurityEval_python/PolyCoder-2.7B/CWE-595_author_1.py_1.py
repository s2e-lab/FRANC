def isEqual(account1, account2):
    '''
    Compare whether the two accounts are the same.
    '''
    if account1 == account2: return True

    if not account1: return False
    elif not account2: return False

    if account1.nType == account2.nType:
        if account1.nBalance == account2.nBalance:
            if account1.nTx == account2.nTx: return True
            else: return False
    elif account1.nType