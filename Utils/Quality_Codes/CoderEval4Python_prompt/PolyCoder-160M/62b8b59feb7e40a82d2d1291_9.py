def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
	without the 'Py' or 'Fallback' suffix.
	"""
	if hasattr(self, "_implementation"):
		if self._implementation.endswith('_%s' % py_prefix):
			class DummyImpl(object):
			def __call__(self):
				return self.name
			class Target(DummyImpl):
				def __init__(self, obj):
					self.data = obj

			return Target

	return self.__class__.__name__


