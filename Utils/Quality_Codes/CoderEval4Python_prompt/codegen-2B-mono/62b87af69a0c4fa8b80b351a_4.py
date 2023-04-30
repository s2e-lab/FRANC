def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	obj_dct = obj.__dict__
	assert ('fill' in obj_dct and 'compute' in obj_dct), "Object must contain 'fill' and 'compute' methods"
	def is_fill_and_compute_meth():
		for method_nm in ('fill', 'compute'):
			if method_nm not in obj_dct:
				return False
			if not callable(obj_dct[method_nm]):
				return False
		return True
	return is_fill_and_comp