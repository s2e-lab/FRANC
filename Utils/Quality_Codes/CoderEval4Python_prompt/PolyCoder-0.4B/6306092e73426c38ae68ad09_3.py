def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	for arg in args:
		# length
		elif len(arg) > args[0].size:
			raise ValidationError("The length is larger than len(args): {}".format(args[0].size))
	return args


# This is the main function for the form logic (the API for both parsing and printing).
# We override this if you see a "form-validation=true" argument to our self.validate_form function.
