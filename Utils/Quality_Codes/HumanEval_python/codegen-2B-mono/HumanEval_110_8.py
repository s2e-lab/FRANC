
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
    numbers = sorted([int(x) for x in lst1])
    j = 0
    for i in range(len(numbers) - 1):
        if numbers[i] % 2!= 0 and numbers[i + 1] % 2!= 0:
            if j + 1 < i + 1:
                j = i + 1
                continue
            return "NO"
    return "YES"

