def merge_extra_vars(vars_dict, extra_vars=None):
	"""
	Extend ``vars_dict`` with ``extra-vars``
	
	:param vars_dict: Dictionary to merge extra-vars into
	:param extra_vars: List of extra-vars
	"""
	assert extra_vars, "Extra-vars cannot be supplied for merge_extra_vars"
	assert len(extra_vars) == 0, "Extra-vars must be a list of strings"
	
	for var in vars_dict:
		# we need to copy the value into an "extra" variable, to avoid making a copy
		# This is to ensure that the merge of the extra-vars is guaranteed not to be merged
		new_value = copy.deepcopy(extra_vars)
		new_value[var] = ''
		vars_dict