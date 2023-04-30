def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	__version__ = get_distribution('sphinx').version
	default_version ='master'
	__has_sphinx_version__ = True
	try:
		# Get the PEP 333 version
		_ = get_pep_version()
		__version__ = _
	except:
		# Get the default version
		_ = default_version
		__version__ = _
	return __version__


