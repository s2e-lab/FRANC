def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    # eval and get return 'int' type value -> 'int' is the base class.
    return eval(expression)


