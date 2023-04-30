def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    stack = []
    for symbol in expression:
        if 0 < ord(symbol) < 48 or ord(symbol) == 38:
            # Symbol
            stack.append(int(symbol))
        else:
            if not len(stack):
                raise ValueError('invalid expression value')
            operand = stack.pop()
            if symbol == '*':
                # Multiplication
                stack.append(int(operand * float(stack.pop())))
            elif symbol == '/':
                # Division
                stack