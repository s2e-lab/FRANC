
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
    if not isinstance(number, int):
        return False

    number_map = {
        1000: "M",
        999: "CM",
        100: "C",
        90: "XC",
        9: "IX",
        8: "V",
        7: "L",
        6: "XL",
        5: "X",
        4: "IV",
        4: "IV",
        3: "III",
        3: "III",
        2: "II",
        2: "II",
