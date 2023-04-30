def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	return [arg for arg in args if isinstance(arg, silence_argument)]

