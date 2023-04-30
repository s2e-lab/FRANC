
def do_algebra(operators, operands):
    expression = str(operands[0])
    for i in range(1, len(operands)):
        expression += " " + operators[i-1] + " " + str(operands[i])
    return eval(expression)