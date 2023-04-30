def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	if args.type == 1:
		return len(args.value) not in args.errors
	else:
		return 0
