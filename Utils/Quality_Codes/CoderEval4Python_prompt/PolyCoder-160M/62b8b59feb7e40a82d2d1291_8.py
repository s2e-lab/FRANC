def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
	without the 'Py' or 'Fallback' suffix.
	"""
	def __init__(self):
		self.implementation = self.config.get('py.platform.implementation')
		self._initClass()
		return
	
	def _initClass(self):
		import py.module
		# We allow Py' prefixing.
		if issubclass(py.module.Module, py.name.Module):
			if isinstance(py.module, py.name.Module):
				def decorator(self_):
					from _py import py
					try:
						py = self