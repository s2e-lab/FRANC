def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    var = 0
    for i, c in enumerate(expression):
        if i == 0:
            var = eval_mathematical_expression(c)
        else:
            if c == '+' or c == '-':
                var = eval_mathematical_expression(expression[:i]) + var
                if c == '-':
                    var *= -1
            elif c >= '0' and c <= '9':
                var = eval_mathematical_expression(expression[:i]) + var * 10 + int