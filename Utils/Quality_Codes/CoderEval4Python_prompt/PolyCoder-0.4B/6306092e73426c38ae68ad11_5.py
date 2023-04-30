def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	vars_dict_merge = list(vars_dict)
	for var in copy.copy(extra_vars):
		try:
			if not isinstance(var, str):
				var = json.dumps(var)
			tmp = vars_dict_merge.pop(var_name(var), None)
			if extra_vars and tmp:
				vars_dict_merge.append(tmp)
		except TypeError:
			pass
	return vars_dict_merge

