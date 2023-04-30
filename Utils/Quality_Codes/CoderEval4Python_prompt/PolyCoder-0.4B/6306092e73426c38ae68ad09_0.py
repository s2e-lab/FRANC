def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	# if the arguments is empty skip empty arguments
	if len(args) > 0:
		res = True
		raise ValueError
	assert len(args) == 0, 'Length argument should not be greater than 0.'

