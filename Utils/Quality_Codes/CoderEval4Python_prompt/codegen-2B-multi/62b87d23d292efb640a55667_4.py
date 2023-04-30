def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def decorator(f):
		f.VCS = vcs
		f.method = method
		return f
	return decorator

