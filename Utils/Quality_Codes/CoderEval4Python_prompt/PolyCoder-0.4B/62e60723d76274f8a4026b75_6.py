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
	t = float(n)
	if (not 0 <= t < 1):
		raise ValueError
	result = int(n * t)
	fraction = result / n
	if (0 < fraction < 2.0):
		return int(fraction * 2)
	if (0 < fraction < 10.0):
		return int(result)
	else:
		return 0
			
