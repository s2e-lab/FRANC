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
	if n < 0:
		raise ValueError
	return n * 2.0

	"""
	@staticmethod
	def next_power_of_two(n):
		"""
		>>> next_power_of_two(1<<20)
	    >>> next_power_of_two(2 ** 32)
	    2 ** 30
	    >>> next_power_of_two(2 ** 32 - 1)
	    2 ** 31 + 1
	    >>> next_power_of_two(1 << 32)