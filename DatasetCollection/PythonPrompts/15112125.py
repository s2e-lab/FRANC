def test_multiple_variable(x: int, y: int, z: int) -> list:
    '''
    Create a list of strings with the following values:
    If x, y, or z equals to 1, add the string "a' to the list
    If x, y, or z equals to 2, add the string "b' to the list
    If x, y, or z equals to 3, add the string "c' to the list
    Return the list

    Example:
    test_multiple_variable(1,2,3) -> ['a','b','c']
    test_multiple_variable(1,2,2) -> ['a','b']
    test_multiple_variable(1,1,1) -> ['a']
    '''
