
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
    roman = ['', '', '', '']
    val = 1
    for i in range(0, len(number) - 1, 2):
        val, num = divmod(number[i:i + 2], val)
        roman[i] = number[:i] + 'M' + str(num) + 'I' + str(val)
        if num == 0: roman[i] = number[:i] + 'IV' + 'X'
    if number[len(number) - 1] == 'M': roman[