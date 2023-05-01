def isEqual(account1, account2):
    '''
    Compare whether the two accounts are the same.
    '''
    if not account1 == account2:
        return False
    elif account1!= Account.ACCOUNT_NONE:
        # The two accounts are the same, the same accounts are also in the same
        # region. So if the second account contains a region this means the
        # two accounts are either the same zone or have a different region. This
        # may mean the two accounts have a different region but the same account.