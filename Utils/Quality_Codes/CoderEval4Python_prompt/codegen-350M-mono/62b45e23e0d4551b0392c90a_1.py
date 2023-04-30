def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	if not isinstance(version_dirs, list):
		raise "Invalid version_dirs type: %s"%type(version_dirs)
	
	for vdir in version_dirs:
		if not os.path.isdir(vdir):
			raise "Version directory %s not exists."%vdir
			
		for f in os.listdir(vdir):
			if f.startswith(".") or f.isspace():
				# Ignore anything other than a dot and
				# white/dot-space files.
				