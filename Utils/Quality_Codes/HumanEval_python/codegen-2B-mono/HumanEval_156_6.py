
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
    roman_dict = {"x": "lix", "v": "five", "iii": "mico", "ix": "trix",
                  "l": "leo",
                  "c": "curio", "cc": "ccurio",
                  "d": "demo", "cd": "cdemo",
                  "m": "majo", "cm": "cmajo",
                  "b": "beo", "bb": "bbemo", "bi": "mico"}
    # if number == 0:
    #     return r