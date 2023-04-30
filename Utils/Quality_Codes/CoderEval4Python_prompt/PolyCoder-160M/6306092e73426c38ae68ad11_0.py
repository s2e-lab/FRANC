def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	for k, v in vars_dict.iteritems():
		if extra_vars and not v in extra_vars:
			del vars_dict[k]
		else:
			vars_dict[k] = vars_dict[extra_vars]
	return vars_dict

