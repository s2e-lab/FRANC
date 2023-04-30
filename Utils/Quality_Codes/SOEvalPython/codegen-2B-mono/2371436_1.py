def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''

    expr = expression
    if '*' in expression:
        expr = expr.split('*')
        res = int(eval_mathematic_expression(expr[0]))
        for operator_index in range(1, len(expr)):
            if operator_index == len(expr):
                if expr[operator_index] == '+':
                    res=res+int(eval_mathematic_expression(expr[operator_index - 1]))
                else:
                    res=res+int(eval_mathematic_expression(expr[operator