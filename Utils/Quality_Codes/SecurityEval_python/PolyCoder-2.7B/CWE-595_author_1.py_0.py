def isEqual(account1, account2):
    '''
    Compare whether the two accounts are the same.
    '''
    assert account1!=account2,"Account types must be the same!"
    if account1.Type!=account2.Type: return False
    return all( account.GetValue(e) == account1.GetValue(e) for e in accounts )
