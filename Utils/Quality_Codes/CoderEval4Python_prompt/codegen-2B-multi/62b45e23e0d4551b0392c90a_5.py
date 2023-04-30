def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	versions = {}
	# loop over all the version directories in the top directory
	for version_dir in version_dirs:
		contentInventory = os.sep.join(version_dir.split(os.sep)[2:])

		# keep a log of the versions which were added to this
		if contentInventory in versions:
			versions[contentInventory]['versions'].append(version_dir)
		else:
			# create the dict of version info
			versions[contentInventory] = {'versions': [version_dir],
