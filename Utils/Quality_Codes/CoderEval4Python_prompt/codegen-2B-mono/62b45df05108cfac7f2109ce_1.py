def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	obj = self.get(path)
	if obj is None:
		raise ValueError("object does not exist: %s" % path)
	root = obj.get_root()
	_valid_versions(root)
	# warn if old XML syntax is present
	ocflversions = obj.get_versions()
	for o in ocflversions:
		_valid_versions(o)
	return True
