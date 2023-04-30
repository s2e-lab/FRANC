def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	
	# get the root inventory file (which represents the root of the version)
	pw_version_dir = self._pw_version_dir
	root_version_dir = version_dirs[0]
	with io.open(pw_version_dir + '/%s/inventory.txt' % root_version_dir, 'r') as inventory_fp:
	# with io.open(pw_version_dir + '/%s/inventory.txt' % version_dirs[0], 'r') as inventory_fp:
		root