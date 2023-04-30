def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	if 'fill' in obj and 'compute' in obj:
		return True
	else:
		return False

