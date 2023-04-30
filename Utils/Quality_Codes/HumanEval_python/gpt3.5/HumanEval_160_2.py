# Here's the implementation of the do_algebra function

def do_algebra(operator, operand):
    """
    This function takes in two lists 'operator' and 'operand', where operator is a list of 
    basic algebra operations, and operand is a list of integers. It builds an algebraic 
    expression using the two given lists and returns the evaluation of this expression.

    Args:
    operator (list): A list of basic algebra operations
    operand (list): A list of non-negative integers

    Returns:
    int: The result of the evaluation of the algebraic expression

    Raises:
    ValueError: If the length of the operator list is not equal to the length of operand list minus one, or
                if either operand list or operator list is empty.

    """
    
    # Check if operator and operand lists are empty
    if not operator or not operand:
        raise ValueError('Operator list or operand list is empty')
    
    # Check if the length of operator list is equal to the length of operand list minus one
    if len(operator) != len(operand) - 1:
        raise ValueError('Length of operator list should be one less than the length of operand list')
    
    # Initialize the result with the first operand
    result = operand[0]
    
    # Iterate through the operator list and perform the corresponding operation on the result
    for i in range(len(operator)):
        op = operator[i]
        num = operand[i+1]
        if op == '+':
            result += num
        elif op == '-':
            result -= num
        elif op == '*':
            result *= num
        elif op == '//':
            result //= num
        elif op == '**':
            result **= num
        else:
            raise ValueError('Invalid operator!')
    
    return result