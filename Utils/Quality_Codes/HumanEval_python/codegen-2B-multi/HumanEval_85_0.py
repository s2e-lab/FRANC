
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    return [n for i, n in enumerate(lst) if i % 2 == 1 and n % 2 == 1]
    

# Assigns:
# lst = [-45, 34, 56, 11, 34, 56, 67, 88, 33]
# new_lst = add(lst)
# print(new_lst)



