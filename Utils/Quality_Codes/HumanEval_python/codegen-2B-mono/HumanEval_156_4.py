
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
    try:
        roman = []
        number = float(number)
        if number == 0:
            roman.append('0')
        while number!= 0:
            if number >= 1000:
                num1, num2 = int(number // 1000), number % 1000
                roman.append(int_to_mini_roman(num1))
                roman.append("'m")
                roman.append(int_to_mini_roman(num2))
                break
            elif number >= 500:
                num1, num2 = int(number //