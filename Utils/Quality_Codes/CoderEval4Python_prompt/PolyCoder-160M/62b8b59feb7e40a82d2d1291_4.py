def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
	without the 'Py' or 'Fallback' suffix.
	"""
	if hasattr(self, "_target_class"):
		try:
			object.__init__(self,self._target_class)
		except:
			pass
		self["_init"] = object.__init__
		print('Instantiating %s.'%self.__class__.__name__)
	return self

