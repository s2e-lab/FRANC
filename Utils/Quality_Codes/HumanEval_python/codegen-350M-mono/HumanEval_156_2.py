
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
    assert is_number(number), "Number must be a positive number"
    roman_numerals = {
        1: '',
        3: 'iii',
        5: 'vi',
        7: 'iii',
        10: 'ii',
        50: 'i',
        100: 'ic',
        
        101: 'v',
        500: 'uu',
        1000: 'i',
        500 * 3: "iii",
        500 * 5: "vi",
        500 * 7: "vv",
        500 * 10