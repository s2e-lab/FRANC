
def rounded_avg(n, m):
    """You are given two positive integers n and m, and your task is to compute the
    average of the integers from n through m (including n and m). 
    Round the answer to the nearest integer and convert that to binary.
    If n is greater than m, return -1.
    Example:
    rounded_avg(1, 5) => "0b11"
    rounded_avg(7, 5) => -1
    rounded_avg(10, 20) => "0b1111"
    rounded_avg(20, 33) => "0b11010"
    """
    n = n % 50
    if n < 1:
        return n
    k = n
    while k < m:
        if k == 0:
            k = k * 10
        elif (k == 1 or (k == 2 and m > 1)):
            k = k * 3 + k
        else:   