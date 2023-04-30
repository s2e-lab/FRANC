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
	return round(n/2 + 0.5) if n > 0 else n
	# a = min(round(n/2 + 0.5), 0) if n < 0 else 0

