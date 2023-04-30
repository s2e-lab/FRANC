def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    operators_dict = {
        '+': operator.add,
        '-': operator.sub,
        '*': operator.mul,
        '/': operator.truediv
    }
    operators_reverse_dict = {v: k for k, v in operators_dict.items()}
    results = []
    for word in expression.split():
        if word in operators_reverse_dict:
            number = eval(word)
            for operator in operators_dict[word]:
                try:
                    number = number(number)