
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
    assert 1 <= number <= 5000, "num must be in (1, 5000]!"
    roman_chr_list = ["I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
    result = ""
    number -= 1
    while number > 0:
        number, roman_chr = divmod(number, 10)
        result += roman_chr_list[roman_chr]
    return result[::-1]

