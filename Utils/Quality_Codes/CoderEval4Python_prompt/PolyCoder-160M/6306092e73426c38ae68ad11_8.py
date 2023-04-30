def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	while len(locals()) < len(vars_dict):
		locals_key, vars_len = locals()
		locals[locals_key] = vars
		vars_dict[locals_key] = vars_dict[locals_key] + extra_vars
	#print "locals %s extra_vars %s", locals.keys(), vars_dict.keys(), extra_vars.keys()
	return vars_dict
