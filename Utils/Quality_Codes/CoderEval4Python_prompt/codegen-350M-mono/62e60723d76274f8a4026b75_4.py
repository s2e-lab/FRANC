def round_half_to_even(n):
	"""
	>>> round_half_to_even(3)
	    3
	    >>> round_half_to_even(3.2)
	    3
	    >>> round_half_to_even(3.5)
	    4
	    >>> round_half_to_even(3.7)
	    4
	    >>> round_half_to_even(4)
	    4
	    >>> round_half_to_even(4.2)
	    4
	    >>> round_half_to_even(4.5)
	    4
	    >>> round_half_to_even(4.7)
	    5
	
	:param n:
	:return:
	"""
	return round(n, 1)


# Task:
# 
# Given an unsorted integer array nums, replace every element in that array with its first
# proper divisor. Input: nums = [1,2,3]
# Output: [1,2,6,7]
# Explanation: Replace all multiples of 1 with their first proper divisor. It turns out that 1
# is the first multiple of 3. We can insert this into the input array such that nums becomes
# [1,3,6,7].
#
#