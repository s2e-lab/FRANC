def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	if extra_vars is None: extra_vars = {}
	for (key, value) in vars_dict.items():
		if isinstance(value, str):
			vars = vars_dict[key]
		elif value is not None:
			if extra_vars.get(key):
				extra_vars[key] += "=" + value
			else:
				extra_vars["{}"] += "=" + value
			vars_dict[key] = str(vars)
	return vars_dict

#include <stdlib.h