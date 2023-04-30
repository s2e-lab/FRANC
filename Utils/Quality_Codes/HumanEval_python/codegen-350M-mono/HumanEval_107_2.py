
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
    def palindrome(n):
        even_odd_list = []
        even_odd_list = list(map(int, str(n)))
        for p in range(len(even_odd_list)-1, -1, -1):
            if even_odd_list[p] == even_odd_list[p+1]:
                continue
            if all(p < n//2-1 for p in range(p, n-1, 2)):
                if all(even_odd_list[i] == even_odd_list