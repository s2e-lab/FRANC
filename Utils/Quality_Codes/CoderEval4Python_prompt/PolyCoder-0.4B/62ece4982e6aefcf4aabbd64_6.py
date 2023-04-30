def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	try:
		return utils.remove_root(path)
	except OSError as exc:
		if exc.errno == 2:
			raise ValueError("Root path `%s' was not found" % root)
		raise


