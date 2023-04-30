def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def handler(f):
		@getattr(f, "register_vcs_handler", lambda : None)()
		def vcs_handler(self, *args, **kwargs):
			return f(self, *args, **kwargs)
		return f
	return handler

