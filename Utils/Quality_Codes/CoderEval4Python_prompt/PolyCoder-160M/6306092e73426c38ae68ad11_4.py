def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	if extra_vars is None:
		extra_vars = vars_dict
	
	for v in vars_dict and extra_vars:
		v = vars(v)
		assert len(v) == len(extra_vars), \
			"extra_vars {} not found in {}".format(extra_vars, vars_dict)
		vars_dict[v] = extra_vars

	return vars_dict, extra_vars


