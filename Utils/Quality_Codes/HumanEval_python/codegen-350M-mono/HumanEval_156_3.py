
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
    roman_list = dict(i_a=['i', 'ii', 'iii', 'iv', 'v'],
                      i_m=['iiii', 'iii', 'IV', 'V']) 
    roman_str = ''
    for digit in str(number):
        roman_str += roman_list.get(digit, 'xx')
    # The Roman numeral 'X' always comes with number that is not roman_str,
    # so we have to deal with that gracefully.
    if roman_str == "