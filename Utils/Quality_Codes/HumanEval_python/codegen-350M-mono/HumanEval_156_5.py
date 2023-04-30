
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
    roman_value = {"I" : 1, "V" : 5, "X" : 10, "L" : 50, "C" : 100,
                   "D" : 500, "M" : 1000}

    def buildNumFromRoman(romanString, pos) -> str:
        # roman_string = roman_value[romanString[pos]]
        # print(roman_string)
        # return int_to_roman(*roman_char_values.index(roman_string))
        #  return romanString.replace('I', '