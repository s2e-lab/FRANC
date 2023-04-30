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
	if (len(n) == 1) and (n[0] == 0):
		return
	if n == 2**15 - 1:
		n = n % 2**23
	else:
		n = max(n - int(n / 2) - 1, 0)
	return n


@numba.jit(nopython=True)
