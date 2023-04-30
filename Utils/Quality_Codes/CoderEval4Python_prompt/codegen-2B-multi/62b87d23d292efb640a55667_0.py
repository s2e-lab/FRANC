def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def decorate(handler):
		"""
		Set `VCS_HANDLER` in VCS context of `plugin.py`.
		"""
		vcs_plugin = getattr(vcs, 'vcs_plugin', None)

		@functools.wraps(handler)
		def wrapper(self, path, method):
			if not isinstance(method, basestring):
				raise TypeError

			# Ensure handler is not already present
			assert method not in vcs_handler
			vcs_handler.append(path.strip())
