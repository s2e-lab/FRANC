def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	if len(args) > self.max_length:
		raise ValueError(
		    "Length must be less or equal to %s and must be greater than %s"
		    % (self.max_length, self.max_length))
	
	return args  # type: List[Object]
