def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    stack: list = []

    calc = re.search(r'(\d+(\s*\d+)*)*([*/]*\d+)*', expression)
    if calc is None:
        return None

    tokens = calc.group().split(' ')
    for token in tokens:
        if token in ('+', '-', '*', '/'):
            result = operation(stack)
            stack.append(result)
            continue
        if token.isdigit():
            stack.append(int(token))
