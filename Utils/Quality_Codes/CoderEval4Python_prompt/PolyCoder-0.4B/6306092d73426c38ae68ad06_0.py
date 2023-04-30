def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	if not args:
		return []
	silenced_args = []
	for i in range(len(args)):
		param_name = args[i].strip()
		if not param_name: continue
		if not self.__silenced(param_name):
			silenced_args.append(param_name.rsplit('.',1))[0]
			continue
		param_def_name = '_%s_' % param_name
                if param_def_