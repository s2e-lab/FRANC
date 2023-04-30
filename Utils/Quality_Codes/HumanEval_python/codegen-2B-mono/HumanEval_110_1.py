
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
    # TODO: Write your solution here.
    # write your code here
    even_lst = []
    even = 0

    if len(even_lst) > 0:
        for item in lst1:
            if item % 2 == 0:
                even_lst.append(item)
            elif item % 2 == 1:
                even = even + 1

    counter = 0

    if len(even_lst) == len(lst1):
        for item in even_lst:
            if counter == 0 and