
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
    assert 1 <= number <= 1000, 'Number n shoule be a positive number from 1 to 1000'
    romans = {100: 'l',
              400: 'lii',
              500: 'lix',
              900: 'liiix',
              1000: 'cm',
              900:'m',
              200: 'd',
              200: 'cd',
              250: 'dii',
              400: 'diiic',
              500: 'diiio',
              600: 'dv',
              700: 'dvi