def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def decorator(f):
		"""
		The actual decorator does the heavy lifting.
		"""
		def wrapped(self, *args, **kw):
			old = self.vcs
			self.vcs = vcs
			try:
				return f(self, *args, **kw)
			finally:
				self.vcs = old
		return wrapped
	return decorator

#------------------------------------------------------------------------------
# VCS Manager

