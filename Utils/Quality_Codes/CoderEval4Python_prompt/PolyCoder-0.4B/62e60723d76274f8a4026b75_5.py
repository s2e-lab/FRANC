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
	from math import ceil, floor
	assert n > 0
	assert is_power_of_2(n)
	if ceil(n / 2) > 0:
		return 0
	if ceil(n / 4) > 0:
		return 1
	if ceil(n / 8) > 0:
		return 2
	if ceil(n / 16) > 0:
		return 3
	if ceil(n / 32) < 0:
		return 4
	if ceil(n / 64) < 0:
		return 5
