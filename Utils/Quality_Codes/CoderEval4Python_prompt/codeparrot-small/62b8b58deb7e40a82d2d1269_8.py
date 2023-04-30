def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	def __init__(self, obj): # pylint:disable=redefined-builtin
		super(Interface, self).__init__() # No type checks on the __call__()
		self._obj = obj
	
	def __call__(self): # pylint:disable=redefined-builtin
		"""
		Return the value of the `obj`
		
		Returns
		-------
		`obj` : `Interface`, the value of `obj`.
		"""
		
		# Note that `obj.__dict__` is in the `_obj` dict, with the error that
		# it's a dictionary has no