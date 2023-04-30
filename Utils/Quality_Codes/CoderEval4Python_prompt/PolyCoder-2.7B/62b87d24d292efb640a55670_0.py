def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	__p, __version, __buildinfo, __debug = _gitinfo()
	return __version, __buildinfo, __debug

