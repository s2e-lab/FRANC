def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	my_version = Version(VERSION)
	return my_version, my_version.build_tag, my_version.short_desc


