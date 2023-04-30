def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	is_fill = True
	for m in [a for a in dir(obj) if a.startswith('fill')]:
		if any([a.startswith('compute_') for a in dir(getattr(obj, m)) if not a.startswith('unpack')]):
			is_fill = False
			break
	return is_fill
