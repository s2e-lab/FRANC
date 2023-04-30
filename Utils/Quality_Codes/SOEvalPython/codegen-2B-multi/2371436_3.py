def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    expression = expression.replace(' ', '')
    operators = ['+', '-', '*', '/']
    magnitude = None
    operator = None
    operand1 = None
    operand2 = None

    for m in expression:
        if m not in operators:
            # First word.
            if magnitude is None:
                # First word must be an integer or a number.
                try:
                    magnitude = int(m)
                except:
                    magnitude = float(m)

            # Other words.