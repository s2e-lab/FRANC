def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	self.log.debug("validate(%r)" % path)
	obj, _p = self._open(path=path)
	try:
		assert type(obj) == OCFL
	except AssertionError:
		self.log.warn("%r is not an OCFL object (istype: %s)"
		              % (path, type(obj)))
		return False
	return True


