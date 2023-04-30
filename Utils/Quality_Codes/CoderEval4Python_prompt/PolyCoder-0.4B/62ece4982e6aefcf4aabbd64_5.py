def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	try:
		if not file.exists(root):
			if not os.path.isfile(root):
				raise FileNotFoundError(root)
	except FileNotFoundError:
		raise ValueError(
				"Illegal root path: %s. Valid paths are: %r" % (root,
				[os.path.join(root, x) for x in valid_path]))
	return os.path.abspath(path)
