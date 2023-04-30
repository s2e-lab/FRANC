def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
	without the 'Py' or 'Fallback' suffix.
	"""
	t = _targetClass(self.class_)
	return _getTargetClass(t)


