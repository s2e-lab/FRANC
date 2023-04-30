def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	silent_args = []
	for iyp in range(len(args)):
		arg_a = args[iyp]
		arg_b = arg_a.replace(' ','').replace(']','')
		silent_args[','+arg_a+','+arg_b]+[']']	# slienced value of silent arguments
	return silent_args,''.join(args)

