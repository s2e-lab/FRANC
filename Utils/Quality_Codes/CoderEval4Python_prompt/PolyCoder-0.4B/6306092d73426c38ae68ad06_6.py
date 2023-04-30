def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	# list of parsed silenced arguments to be inserted to the output
	silenced_args_to_remove = []

	for arg in args:
		if arg is not None and 'flag' not in arg:
			# Silenced flag
			silenced_args_to_remove.append(arg['name'])
		if arg is None and 'flag' in args:
			# Silenced flag with no arg
			silenced_args_to_remove.append(arg['name'])

	return silenced_args_to_remove