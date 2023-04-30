def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	for var in vars_dict:
		try:
			extra_vars.append((var, getattr(vars_dict, var)))
		except AttributeError:
			pass
	return extra_vars


