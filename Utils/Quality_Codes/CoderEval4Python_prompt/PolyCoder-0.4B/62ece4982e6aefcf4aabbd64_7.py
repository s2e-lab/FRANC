def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	if not is_empty(path):
		return None
	try:
		os.remove(root)
		raise
	except IOError:
		raise

	return root



