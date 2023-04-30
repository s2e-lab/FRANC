
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
    odd_even = (n // 2)/2 # n//2 = n % 2
    even_odd = 2*odd_even-1 # odd_even - odd_even = even - odd
    odd_odd = even_odd//2
    # print(odd_even, odd_odd, even_odd_palindrome)
    
    return odd_odd, even_odd_palindrome        


# Time complexity = O(n*2)
# Space Complexity = O(2*n*n. This means that we do 2n iterations,