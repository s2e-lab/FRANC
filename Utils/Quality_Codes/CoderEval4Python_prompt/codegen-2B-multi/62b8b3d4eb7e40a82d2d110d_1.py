def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	
	This uses the ``PURE_PYTHON`` variable as documented in `_use_c_impl`.
	"""
	if __debug__:
		from rpython.translator.tool.cbuild import c_generator
		assert c_generator.PURE_PYTHON
	return getattr(sys, 'pure_Python', True)

