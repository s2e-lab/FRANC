def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	# 1. Check that each directory in version_dirs as a valid inventory
	#    We do not care what is in these inventories as long as
	#    the contents is valid.
	for idx in xrange(0,len(version_dirs)):
		try:
			assert os.path.exists(version_dirs[idx])
			inventories_version = version_dirs[idx]
		except Exception as e:
			print ("version not exist (or invalid inventory) [%s] %s %s %s