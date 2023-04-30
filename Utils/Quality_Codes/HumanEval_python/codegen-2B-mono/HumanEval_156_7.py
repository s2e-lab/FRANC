
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
    # initialize a result list that will be returned
    result = []

    # initialize a dictionary that will be used to convert characters into roman numeral
    mini_roman = {
        "i": "i",
        "ii": "ii",
        "iii": "iii",
        "iv": "iv",
        "v": "v",
        "vi": "vi",
        "vii": "vii",
        "viii": "viii",
        "ix": "ix",
        "x": "x",
        "xx