def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    token_reader = tokenize(expression)
    stack = [0]
    for token in token_reader:
        operator = token[0]
        is_first_number = token[2]
        if operator =='sin':
            x = stack.pop()
            stack[-1] = math.sin(x)
        elif operator == 'cos':
            x = stack.pop()
            stack[-1] = math.cos(x)
        elif operator == 'exp':
            x = stack.pop()
            stack