def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    operators = {
        '+': operator.add,
        '-': operator.sub,
        '*': operator.mul,
        '/': operator.truediv,
        '-x': op.neg
    }
    ops = expression.replace('(', '(').replace(')', '').replace('-','').split(' ')
    return eval_ops(ops, operators)


