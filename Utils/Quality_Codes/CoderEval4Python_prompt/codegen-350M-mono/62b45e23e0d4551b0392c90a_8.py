def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	# This is actually the version number, but it could be anything as long as
	# there are a number of versions (e.g. a version number of 7 would indicate
	# the "7.0.14" version, and a version number of 1.3 would indicate that a
	# version number of "1.3" is the first version (a 3) in its sequence).
	# I don't know enough about a particular version that we allow, so
	# allow for one if we can tell the set of versions we know.
	known_version = 0
	