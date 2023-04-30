def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    if not expression:
        return 1

    def evaluate(operator, operand):
        if operator == '*':
            return operand * eval_mathematical_expression(expression[1:])
        elif operator == '/':
            return operand // eval_mathematical_expression(expression[1:])
        elif operator == '+':
            return operand + eval_mathematical_expression(expression[1:])

    return int(evaluate(expression[0], 1))


