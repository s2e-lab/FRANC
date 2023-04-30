def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	if args[0] > len(args[:self.max_args_len]):
		msg = 'Length of arguments exceeded!'.replace('*', '...').replace(' ', '.')
		self.print_message(msg)
	else:
		return True

