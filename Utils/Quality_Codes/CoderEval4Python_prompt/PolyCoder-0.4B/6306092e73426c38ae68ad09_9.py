def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	if len(args) > int(self.max_length):
		raise InvalidLengthError(str(self.max_length) + " characters are not allowed")
	self.assert_string_is_valid(args)

