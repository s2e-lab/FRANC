
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
    if number <= 1000 or number > 9999:
        return ""

    r = ""

    val = []
    val_list = list(number)

    # loop over each possible value
    for i, j in enumerate(val_list):
        val_list[i] = f'{int(j)}'

    # go over each digit/value
    for value in val_list:
        # check all digits only to avoid double conversion
        for _ in range(len(value)):
            r += value.replace('i', '')

