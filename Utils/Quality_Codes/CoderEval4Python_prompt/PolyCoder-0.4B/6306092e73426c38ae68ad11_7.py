def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	vars_dict = vars_dict.copy()
	for (key, value) in vars_dict.items():
		if value not in extra_vars:
			vars_dict[key] = extra_vars.append(value)
	return vars_dict

#region License