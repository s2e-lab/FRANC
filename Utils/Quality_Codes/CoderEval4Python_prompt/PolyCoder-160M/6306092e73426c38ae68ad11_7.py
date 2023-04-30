def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	vars = copy(vars_dict)
	for name, value in vars_dict.items():
		if value is not None:
			vars[name] = replace_vars(**vars, value=value)
	return vars
	
	
