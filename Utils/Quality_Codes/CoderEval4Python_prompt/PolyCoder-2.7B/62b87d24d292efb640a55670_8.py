def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	version_file = get_config_var("_VERSION_FILE")

	if not version_file:
		return _version.VersionInfo()

	with open(version_file) as f:
		exec(compile(f.read(), version_file, 'exec'))
		exec(compile(f.read(), version_file, 'exec'))

	return _version.VersionInfo(_version.VersionInfo.parse(version_file))

