def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	return _pf.OCFLObjectValidate(self.fs, str.encode(path))

