def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	
	This uses the ``PURE_PYTHON`` variable as documented in `_use_c_impl`.
	"""
	c = {}
	execfile(settings.module_path+"/include/python.h",c)
	try:
		return c['PURE_PYTHON']
	except KeyError:
		return True
