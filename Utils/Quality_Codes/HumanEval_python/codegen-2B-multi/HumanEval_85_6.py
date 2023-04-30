
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    num_is_even = [x%2 == 0 for x in lst]

    assert(all(num_is_even))
    return sum([num_is_even[0] if x%2 == 0 else x for x in lst])

