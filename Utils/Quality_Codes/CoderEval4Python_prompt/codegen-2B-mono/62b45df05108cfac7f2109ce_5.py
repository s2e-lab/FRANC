def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	fs = FilesystemOCD(path)
	return fs.validate(path, warn_on_clobber=self.warn_on_clobber, warn_on_overwrite=self.warn_on_overwrite)

