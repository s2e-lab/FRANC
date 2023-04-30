def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	# TODO: maybe do something with this logic to warn people when a version
	# is not found in the repository if a new-fangled way was not suggested.
	# (i.e. no 'deploy' flag)
	logging.error("TODO: check for this in version.py")
	#assert version_dirs is not None
	assert isinstance(version_dirs, list)
	assert len(version_dirs) > 0

	# find the latest version
	n = 1
	latest_dirname = None
	