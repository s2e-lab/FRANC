
def int_to_mini_roman(number):
    """
    Given a positive integer, obtain its roman numeral equivalent as a string,
    and return it in lowercase.
    Restrictions: 1 <= num <= 1000

    Examples:
    >>> int_to_mini_roman(19) == 'xix'
    >>> int_to_mini_roman(152) == 'clii'
    >>> int_to_mini_roman(426) == 'cdxxvi'
    """
    digits = {
        1: 'i',
        4: 'iv',
        5: 'v',
        9: 'ix',
        10: 'x',
        40: 'l',
        50: 'lx',
        90: 'xc',
    }
    result = ''

    for i in range(number):
        for key, value in digits.items():
            if key >= i:
                if value not in result:
                    result = result + value

    return result


# print(int_to_mini_roman