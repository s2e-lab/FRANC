def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	_ = get_distribution('version')
	v = {}
	for item_ in _().list(cache=_cache):
		v[item_['version']] = item_
	return v
