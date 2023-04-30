def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''

    operator_counter = 0

    for operator in expression.split(')'):
        if operator == '++':
            operation(operator, +1)
        elif operator == '--':
            operation(operator, -1)
        elif operator == '*':
            operation(operator, 1)
        elif operator == '/':
            operation(operator, 0.5)
        elif operator == '%':
            operation(operator, 0.1)
        elif operator == '+':
            operation(operator, 1)
        elif