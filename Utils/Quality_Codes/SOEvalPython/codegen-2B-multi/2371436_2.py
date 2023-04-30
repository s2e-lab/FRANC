def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''

    operators = ['+', '-', '*', '/']

    while True:
        first_part, second_part = next_part(expression)
        # print('First part', first_part)


