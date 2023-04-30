def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	if isinstance(vars_dict, dict):
		for vars_var in vars_dict:
			vars_var.extend(extra_vars)
	else:
		raise TypeError("cannot extend {} to an argument list".format(vars_dict or []))
	return vars_dict
	
	def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``

	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List