def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	if args == None:
		return None
	args = list(args)
	for arg in args:
		if arg[-1] in ['-i','-i2','-i4','-I','-s','-s2','-s4','-S']:
			if '=' in arg:
				if '[' in arg or ']' in arg:
					newarg = arg.replace('=', '[').replace(']', ']')
					args.remove('=')
					newarg = replace_double_quotes(newarg, ',')
			