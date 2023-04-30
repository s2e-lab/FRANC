def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	if not os.path.exists(root):
		raise ValueError("root not found")
	os.unlink(root)


