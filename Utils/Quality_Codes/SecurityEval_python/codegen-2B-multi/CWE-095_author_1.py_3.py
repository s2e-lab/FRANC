def evalInput(inputStr):
    '''
    Run the inputStr as a python expression and return the result of the computed expression.
    '''
    print 'Compiling:'+ inputStr

    result    = jythonLib.eval(inputStr)

    print 'Expected   :'+ result
    print 'Real result:'+ str(__result)

    return __result

