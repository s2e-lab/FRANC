
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
    # convert to uppercase
    letters_to_upper = [i for i in s[2:-1]]
    lower_case = [i for i in s[1: -1].lower() if i > 0]
    upper_case = [i for i in s[2:-1: -1].upper() if i > 0]

    # sort
    for k in [1, 4, 7]:
        if k < 10:
         