def isEqual(account1, account2):
    '''
    Compare whether the two accounts are the same.
    '''
    if account1!= account2:
        return False
    if type(account1)!= type(account2):
        return False
    if account1.isLocked()!= account1.isLocked():
        return False
    if account1.isDisabled()!= account1.isDisabled():
        return False
    if int(account1.id())!= int(account2.id()):
    