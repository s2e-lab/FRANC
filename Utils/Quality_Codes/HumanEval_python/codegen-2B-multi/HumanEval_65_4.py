
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    if shift <= 0: return x
    temp = []
    for digit in x:
        temp.append(digit)
    for i in range(len(temp) - shift):
        # append temp[i], temp[-1], temp[i-shift]-1, temp[i-1]
        temp.insert(0, temp[i-shift])
        temp.extend(map(lambda j: str(j-1), temp[i:]))
        temp.extend(temp[i:])
        temp.pop(-1)
    