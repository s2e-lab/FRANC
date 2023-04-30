def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	
	This uses the ``PURE_PYTHON`` variable as documented in `_use_c_impl`.
	"""
	__cpp_optimizations_required = False
	try:
		if _use_c_impl is not None:
			if _use_c_impl is True:
				__cpp_optimizations_required = True
			elif _use_c_impl is None\
				and 'CUDA_SUPPORTED' in os.environ and os.environ['CUDA_SUPPORTED']\
				and not _USE_C_FORCE:
				__cpp_optimizations_required = True
	except AttributeError:
		pass

	return