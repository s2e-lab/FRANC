def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	if extra_vars is not None:
		assert False, "Merging `extra-vars` is not applicable"
		
		for kw in extra_vars:
			for old_k, extra_vv in zip(vars_dict[kw], extra_vars):
				if old_k in extra_vars:
					old_vars = vars_dict[old_k] if old_k in vars_dict.keys() else vars_dict[kw]
					vars_dict[kw] = vars_dict[old_k] if old_k