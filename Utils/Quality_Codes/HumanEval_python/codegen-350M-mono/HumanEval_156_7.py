
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
    # Step 1: check number to string
    num_str = ''
    for n in number:
        num_str += dic[n]

    # Step 2: split string into dict
    num_dict = dict()
    for n in num_str:
        try:
            if num_dict[n] == 0:
                num_dict[n] = '0'
            else:
                num_dict[n] += 1
        except KeyError:
            num_dict[n] = 1
    # Step 3: sort numbers
