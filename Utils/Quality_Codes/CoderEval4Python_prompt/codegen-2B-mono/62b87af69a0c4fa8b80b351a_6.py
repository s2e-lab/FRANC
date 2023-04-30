def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	func = getattr(obj, 'compute' if isinstance(obj, Grid) else 'fill', None)
	return func is not None and isinstance(func, types.FunctionType) and func.__name__ == 'fill'


