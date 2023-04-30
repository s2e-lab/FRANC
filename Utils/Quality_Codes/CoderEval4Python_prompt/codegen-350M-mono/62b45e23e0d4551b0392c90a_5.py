def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	for version in range(1, len(version_dirs)):
		inven = None
		# read the inven from the cache, if any.
		# note: this can call load_version_inventory but can't be imported right now!
		# since load_version_inventory has different dependencies that load_version
		# (ie, this has to import versions from other repositories)
		try:
			inven = self.get_version_inventory(version_dirs[version])
		except FileNotFoundError:
			inven = {}
		
