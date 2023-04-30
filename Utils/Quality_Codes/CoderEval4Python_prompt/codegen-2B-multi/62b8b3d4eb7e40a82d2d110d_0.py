def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	
	This uses the ``PURE_PYTHON`` variable as documented in `_use_c_impl`.
	"""
	if not isinstance( _use_c_impl, bool):
		raise RuntimeError('PURE_PYTHON must be defined')
	return _use_c_impl and _c_optimizations_required_impl()
	
