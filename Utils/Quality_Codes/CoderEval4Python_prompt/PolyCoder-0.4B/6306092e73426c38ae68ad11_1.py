def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	"""
	Make sure at least one of the variables already exists.

	:param vars_dict: A dictionary of variables to check
	:param extra_vars: list to merge extra variables into
	
	"""
	
	vars_with_merge_vars = {}
	for v, f in extra_vars:
		if f in vars_with_merge_vars:
			var_names = vars_with_merge_vars[f] = f for f in vars_dict[v]
		else:
			for f in vars_dict[v