def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    numeric_stack = Stack()
    last_operator = None
    calculate_stack = True

    for token in expression.split():
        token = token.lower()

        if token.isdigit():
            numeric_stack.push(int(token))
        elif token == ')':
            while last_operator is '(' and calculate_stack:
                numeric_stack.pop()
                last_operator = operator_stack.pop()
                if last_operator is None:
                    break
            if calculate_stack:
