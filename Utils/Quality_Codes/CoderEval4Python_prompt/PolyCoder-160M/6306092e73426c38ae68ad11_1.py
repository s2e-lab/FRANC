def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	if vars_dict is None:
		raise ValueError("'vars_dict' is None.")
	if len(vars_dict) > len(extra_vars):
		raise ValueError("'vars_dict' has too many fields in it.")
	for k, v in vars_dict.items():
		if not isinstance(v, dict):
			del vars_dict[k]
		var_dict[k] = v
	return var_dict

