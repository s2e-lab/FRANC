def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	while True:
		if extra_vars is None:
			extra_vars = list(vars_dict.keys())
		elif extra_vars:
			first = extra_vars.pop()
			first_vars = extra_vars
			second = vars_dict.pop(first, None)
			second_vars = vars_dict.pop(second, None)
			extra_vars.extend(first_vars + second_vars)
		else:
			return vars_dict
	return

/*
 * Licensed to