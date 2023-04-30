def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	return not obj.functions("fill", []) \
	       and not obj.functions("compute", [])


