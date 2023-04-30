def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	if extra_vars:
		for item in extra_vars:
			if dictutils.get(item, "var_dict", {}).get("extra_vars", {})[item] in vars_dict:
				extra_vars.remove(item)
				vars_dict[dictutils.get(item, "var_dict", {}).get("extra_vars", {})[item] :] = extra_vars
	
	merge_vars_list(vars_dict, extra_vars=extra_vars)
	
	if len(vars_dict["var