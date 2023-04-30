
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
    s = to_unicode(s)
    is_upper_visev = False
    if s!= s[0:2:]:
        is_upper_visev = True
        s = to_unicode(s[:2:].lower())
    if is_upper_visev:
        s = to_unicode(s.upper())
        for suffix in s[..:2:]:
  