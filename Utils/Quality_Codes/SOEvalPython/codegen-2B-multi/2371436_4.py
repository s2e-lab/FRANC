def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    result = 0

    for operand in expression.split(' '):
        if operand in ['+', '-', '*', '/']:
            right_operand = eval_mathematical_expression(operand + operand)
            result = eval_mathematical_expression(operand, result, right_operand)
        else:
            result = eval_mathematical_expression(operand, result)

    return result


