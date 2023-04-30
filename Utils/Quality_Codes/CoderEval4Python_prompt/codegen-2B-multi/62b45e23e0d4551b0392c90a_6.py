def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	for i, version_dir in enumerate(version_dirs):
		digest = self.check_version_inventory_at(version_dir)
		if i!= 0:
			# root dir, no digest
			if digest!= None:
				raise RuntimeError("Digest for version %s doesn't match root inventory" % version_dir)
		
	# now check for files with differences from root
	for version_dir in version_dirs:
		digest = self.check_version_inventory_at(version_dir)
		for root,