
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
    # Time complexity: O(n*log(n)), where n is the whole number.
    # Space Complexity: O(n)
    # Time complexity: O(n), here is the code.
    if n == 0 or n == 1:
        return (1,1)

    even_odd_tuple = [(n//2, n%2)]
    odd_palindrome = (n%2, (n//2) + 1)
    even_palindrome = (n//2 + 1, n%2)

#     def