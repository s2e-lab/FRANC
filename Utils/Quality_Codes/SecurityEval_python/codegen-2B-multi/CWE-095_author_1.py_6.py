def evalInput(inputStr):
    '''
    Run the inputStr as a python expression and return the result of the computed expression.
    '''
    assert(isinstance(inputStr, str))
    print inputStr
    tmp=pyeval.compile(inputStr)
    print tmp
    print pyeval.evaluate(tmp)
    return pyeval.evaluate(tmp).result

