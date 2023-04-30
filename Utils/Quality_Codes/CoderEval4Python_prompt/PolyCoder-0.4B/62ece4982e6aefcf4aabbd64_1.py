def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	try:
		if not is_path_root(path):
			return
		else:
			pass
	except Exception:
		pass
	path = os.path.abspath(path)
	assert not is_path_root(path)

