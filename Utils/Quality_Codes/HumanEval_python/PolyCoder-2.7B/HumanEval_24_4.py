

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """
    for i in range(len(divisor_map) - 1, 0, -1):
        if n % divisor_map[i] == 0:
            return divisor_map[i]
    else:
        return divisor_map[0]
