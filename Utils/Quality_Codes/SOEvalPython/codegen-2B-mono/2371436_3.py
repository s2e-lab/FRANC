def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    
    result = 0
    while(len(expression)):
        if (expression[0] == '+'):
            result += eval_mathematical_expression(expression[1:])
        elif (expression[0] == '*'):
            result *= eval_mathematical_expression(expression[1:])
        else:
            result = int(expression)

        expression = expr.infix_to_postfix(expression[1:])
        
        # remove ')'
        expression = re.sub(r'\)