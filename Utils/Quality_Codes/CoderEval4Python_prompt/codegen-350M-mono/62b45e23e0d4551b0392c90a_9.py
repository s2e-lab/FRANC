def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	assert len(version_dirs)
	assert all([isdir(v) for v in version_dirs])
	# We must validate the versions in reverse order since we assume the list
	# always holds in increasing order.
	version_set = set(version_dirs)
	while len(version_set) > 0:
		assert version_set.pop() in version_set
	for i, v in enumerate(version_dirs):
		versions = [v]
		validate_version_dirs(v, versions)

def