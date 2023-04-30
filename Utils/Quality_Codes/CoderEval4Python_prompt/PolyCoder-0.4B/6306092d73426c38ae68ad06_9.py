def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	silents = []
	for arg in args:
		if arg.is_dict() and len(arg.items()) > 1: # only a single line, not only the key (just value)
			keys = list(set(arg.keys()) - set(silents))  # keys = keys to suppress
			silents = []
			for key, value in arg.items():
				silents.append(('%s:'% key).replace(':value', ':value'))
		return args, (': value', ':value')
	