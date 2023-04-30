def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	# We grab the version from the S3 driver at this point,
	# so don't worry about locking the cache version.
	# For local_data, it is a single version, so all we have to do is grab them.
	if hasattr(local_settings, "local_data"):
		info_dict = local_settings.local_version_map()
	elif hasattr(global_settings, "local_data"):
		info_dict = global_settings.local_version_map()
	else:
		info_dict = {}

	