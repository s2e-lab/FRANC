def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	args = list(args)
	assert isinstance(args, list)
	args = args[:]
	silence_args = list(self._silent_args)
	args.extend([ silence_args[-1] if hasattr(silence_args[-1], '__len') else silence_args ] )
	return args
