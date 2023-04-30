def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	# TODO: Remove this method, it is mostly being used for development
	if not isinstance(args, (list, tuple)):
		return 'Unsupported arguments type {!r}'.format(args.__class__)
	
	# Get the arg name
	arg_name = args.pop(0)
	if isinstance(arg_name, bytes):
		arg_name = arg_name.decode('unicode_escape')
		
	# Get the arg value
	arg_value = args.pop(0)
	
	cho