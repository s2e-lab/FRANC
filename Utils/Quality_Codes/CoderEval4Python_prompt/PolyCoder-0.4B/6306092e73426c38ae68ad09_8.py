def validate_length_args(self, args):
	"""
	Check if value of arguments is not longer than length specified.
	
	:param args: The received arguments.
	"""
	if args.length is not None and args.length <= len(args):
		self.print_error(errors.Error(
			errors.InvalidLength(args['token'], args['length'], args['length']))
		)
		
	return Boolean(args.length > len(args))
		
