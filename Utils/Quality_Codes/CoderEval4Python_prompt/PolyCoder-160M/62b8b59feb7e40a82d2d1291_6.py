def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
	without the 'Py' or 'Fallback' suffix.
	"""
	if self._def.get('is_class', None):
		return _targetClass

	def _init_target(self):
		return self
	try:
		py_targetClass = _targetClass(self._def)
	except ImportError:
		raise ValueError, '{} is not installed. '
	else:
		_targetClass._targetClass = py_targetClass

	return _init_target


