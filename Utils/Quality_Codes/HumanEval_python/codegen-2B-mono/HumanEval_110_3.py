
def exchange(lst1, lst2):
    """In this problem, you will implement a function that takes two lists of numbers,
    and determines whether it is possible to perform an exchange of elements
    between them to make lst1 a list of only even numbers.
    There is no limit on the number of exchanged elements between lst1 and lst2.
    If it is possible to exchange elements between the lst1 and lst2 to make
    all the elements of lst1 to be even, return "YES".
    Otherwise, return "NO".
    For example:
    exchange([1, 2, 3, 4], [1, 2, 3, 4]) => "YES"
    exchange([1, 2, 3, 4], [1, 5, 3, 4]) => "NO"
    It is assumed that the input lists will be non-empty.
    """
    # TODO: implement this function.
    # Start an out variable
    list1 = []
    # Check if the list is empty
    if len(lst1)!= 0 and len(lst2)!= 0:
        # While the out variable is true do this
        while lst1:
            list1.append(lst1.pop())
            lst2.pop()
        if len(list1) % 2 == 0:
            # Check if they are a perfect number
            if all(item % 2 == 0 for item in list