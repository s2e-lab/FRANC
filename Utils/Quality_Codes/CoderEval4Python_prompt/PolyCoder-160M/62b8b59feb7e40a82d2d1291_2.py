def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
	without the 'Py' or 'Fallback' suffix.
	"""
	if not self._implIsTarget:
		self._implMakeUp = self._getImpl
		s ='return PyPy2Py'
	else:
		# PyPy2Py
		s ='return PyPy'
	if not hasattr(self, s):
		self._implIsTarget = False
		self._implMakeUp = self._getOrCreate
		self._implIsTarget = True
	# fallback: Fallback
	if self._implIsTarget:
		s ='return FallbackPyPy'
		if