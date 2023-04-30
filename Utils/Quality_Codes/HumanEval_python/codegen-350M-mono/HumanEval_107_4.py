
def even_odd_palindrome(n):
    """
    Given a positive integer n, return a tuple that has the number of even and odd
    integer palindromes that fall within the range(1, n), inclusive.

    Example 1:

        Input: 3
        Output: (1, 2)
        Explanation:
        Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.

    Example 2:

        Input: 12
        Output: (4, 6)
        Explanation:
        Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.

    Note:
        1. 1 <= n <= 10^3
        2. returned tuple has the number of even and odd integer palindromes respectively.
    """
    even_odd = [[0,0],[0,0],[0,0]]
    for i in range(1, n+1, 1):
        odd_even = even_odd
        for j in range(0,2):
            if j % 2 == 0:
                odd_even = insert_even(odd_even,  even_odd[j][0]-even_odd[j][1], i)
            else:
                even_odd = insert_odd(odd_even, even_odd[j+1][0]-even_odd[j