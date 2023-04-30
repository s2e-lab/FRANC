def eval_mathematical_expression(expression: str) -> int:
    '''
    Evaluate a mathematical expression.

    Example:
        eval_mathematical_expression('1 + 2 * 3') -> 7
    '''
    def eval_expression_at(start_idx: int, string: str) -> int:
        result = 0
        for end_idx in range(start_idx, len(string) + 1):
            if string[end_idx] in {'*', '\\'}:
                result += eval_expression_at(start_idx + 1, string)
            else:
                continue

        return result

    return eval_expression_at(0, expression)
