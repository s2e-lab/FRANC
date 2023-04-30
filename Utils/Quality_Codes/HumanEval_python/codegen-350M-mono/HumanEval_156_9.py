
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
    if number in (1, 2, 5, 9, 99):
        return roman(number)
    output = []
    _number = number
    string_dictionaries()

    for val in stringdictionaries():
        if string_dictionaries()[string_dictionaries()][0] <= number <= string_dictionaries()[string_dictionaries()][2]:
            output.append(string_dictionaries()[string_dictionaries()][1])
            _number -= string_dictionaries()[string_diction