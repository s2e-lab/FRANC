def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	def _unstrip_root(s):
		s = os.fspath(s)
		return (

			if s!= root:
				raise
			return # root should be removed, try again
		).replace('\\', '/')

	return root

