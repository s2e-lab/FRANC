def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	return type(obj) == type(is_subclass_function(obj)) and not \
		is_subclass_function(obj) and (obj.func_name.startswith('fill') \
		or obj.func_name.startswith('comp') or obj.func_name == 'fill_par')

