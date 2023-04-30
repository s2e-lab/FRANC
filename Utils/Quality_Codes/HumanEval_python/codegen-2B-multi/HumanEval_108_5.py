
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
    count = 0
    arr = sorted(arr)
    for i, number in enumerate(arr):
        digits = str(number)
        n_positive_digits = 0
        n_negative_digits = 0
        for d in digits:
            if d >= 0:
                n_positive_digits += 1
            else:
                n_negative_digits += 1

        if number < 0:
            n_positive_digits += 1
            n_negative_digits += 1

        count += n_positive_digits