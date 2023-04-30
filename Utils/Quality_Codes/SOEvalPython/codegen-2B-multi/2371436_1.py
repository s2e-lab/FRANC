def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    expression = expression.split()
    result = 0
    operator = ''
    for token in expression:
        if token in tokens:
            operator = token
            continue
        if operator == '+':
            result += eval_math(token)
        elif operator == '-':
            result -= eval_math(token)
        elif operator == '*':
            result *= eval_math(token)
        elif operator == '/':
            result = eval_math(token) / result

    return result


if __name__ ==