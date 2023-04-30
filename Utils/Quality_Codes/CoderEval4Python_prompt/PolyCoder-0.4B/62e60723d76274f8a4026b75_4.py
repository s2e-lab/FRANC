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
	if math.isinf_dtype(n):
		raise ValueError
	if float64(n)/float64(n + 1)!= float64(1):
		raise ValueError
	return int(n) + 1


