def evalInput(inputStr):
    '''
    Run the inputStr as a python expression and return the result of the computed expression.
    '''
    def wrap(x):
        res = eval(x)
        return res

    import bpython, types
    return wrap(input(inputStr))

