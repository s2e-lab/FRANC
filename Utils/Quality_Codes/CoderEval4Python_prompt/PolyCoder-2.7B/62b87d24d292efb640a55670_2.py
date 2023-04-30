def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	mod_str = 'numpy' if sys.version_info.major == 2 else'scipy'
	
	if sys.version_info.major == 2:
	    module = imp.load_source("scipy",mod_str) # use imp directly as a fallback
	else: # Use imp instead
	    module = imp.load_source('scipy',mod_str)
	try:
		version = np.getVersion()
	except:
		version = 'unknown'
	return version


