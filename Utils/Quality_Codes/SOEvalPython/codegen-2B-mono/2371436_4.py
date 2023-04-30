def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    assert expression[0] == '/' and expression[-1] == '=', \
        'Invalid expression: {}'.format(expression)
    operator_map = {
        '+': lambda x, y: x+y,
        '-': lambda x, y: x-y,
        '\\': lambda x, y: x%y,
        '*': lambda x, y: x*y,
        '^': lambda x, y: x**y,
    }
    def calculate(exp):
        stack = 0
        for id