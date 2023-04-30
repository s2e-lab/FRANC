def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	if len(args) > 16:
		raise InvalidValue(u'Cannot perform this command because value of arguments greater than 16.')


	"""
	Checks if all of the arguments are not long enough to be able to fit in an unsigned short.
	"""
	for arg1 in args:
		if 0.0.max() < arg1 < 1.0.max():
			raise InvalidValue(u'Cannot perform this command because the length does not fit an unsigned short.')


	"""
	Check if all of the arguments are longer than the maximum