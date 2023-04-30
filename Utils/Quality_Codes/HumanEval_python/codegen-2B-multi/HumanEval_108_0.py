
def count_nums(arr):
    """
    Write a function count_nums which takes an array of integers and returns
    the number of elements which has a sum of digits > 0.
    If a number is negative, then its first signed digit will be negative:
    e.g. -123 has signed digits -1, 2, and 3.
    >>> count_nums([]) == 0
    >>> count_nums([-1, 11, -11]) == 1
    >>> count_nums([1, 1, 2]) == 3
    """
    sum = 0
    i = len(arr) - 1
    while i >= 0:
        sum += arr[i]
        i -= 1
    count = 0
    while i >= 0:
        sum += arr[i]
        try:
            # Note the first digit may be negative
            sum = sum % 10
            if sum > 0:
                count += 1
        except:
            pass
        i -= 1
    return count
