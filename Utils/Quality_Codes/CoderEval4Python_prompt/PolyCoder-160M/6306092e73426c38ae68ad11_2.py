def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	with merge_all_vars(extra_vars):
		for var in vars_dict:
			vars_dict[var] = extra_vars[var]
		#print('Merge extra')
	#print('Vars'+ ', '.join(vars_dict))

