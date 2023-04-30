# begin solution
def do_algebra(operator, operand):
    # initialize result with the first operand
    result = operand[0]
    # iterate through the operator list and operand list simultaneously
    for i in range(len(operator)):
        # apply the current operator to the current result and the next operand
        if operator[i] == '+':
            result = result + operand[i+1]
        elif operator[i] == '-':
            result = result - operand[i+1]
        elif operator[i] == '*':
            result = result * operand[i+1]
        elif operator[i] == '//':
            result = result // operand[i+1]
        elif operator[i] == '**':
            result = result ** operand[i+1]
    # return the final result
    return result
# end solution