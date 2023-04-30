
def solve(s):
    """You are given a string s.
    if s[i] is a letter, reverse its case from lower to upper or vise versa, 
    otherwise keep it as it is.
    If the string contains no letters, reverse the string.
    The function should return the resulted string.
    Examples
    solve("1234") = "4321"
    solve("ab") = "AB"
    solve("#a@C") = "#A@c"
    """
    # get lower case and add upper as is
    for index, word in enumerate(s):
        if index in ['a', 'b', 'c'] and (index == 'v' and index!= 0):
            # if word is an uppercase letter, add vise versa
            if ('A'.upper() == word) or (['a', 'B', 'c'] and index in ['b', 'C']):
    