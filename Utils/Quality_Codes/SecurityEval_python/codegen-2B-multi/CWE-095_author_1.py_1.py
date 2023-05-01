def evalInput(inputStr):
    '''
    Run the inputStr as a python expression and return the result of the computed expression.
    '''
    try:
        eval (inputStr)
    except NameError:
        print "[error] Invalid variable: '%s'" % inputStr
        sys.exit(1)
    except SyntaxError:
        print "[error] Syntax error in input expression: %s" % inputStr
        sys.exit(1)
    except TypeError:
        print "[error] Not a valid expression: %s" % inputStr
        sys.exit(1)
