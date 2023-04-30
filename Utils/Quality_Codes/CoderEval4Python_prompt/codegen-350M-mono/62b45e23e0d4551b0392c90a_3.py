def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	
	def validate_inventory(self, inventory_fileName, inventory_dirName,
			validateCache=None):
		"""
		Use self._validateCache to check if we already have an inventory based on a hash
		or set of hashes, and attempt to validate its contents. This is done by checking
		every entry in the file, then checking it, and finally checking that the hash is a SHA
		of that hash (i.e. the hash of the hash of the version directory name followed by the
		version number in the entry (if a version number is given)