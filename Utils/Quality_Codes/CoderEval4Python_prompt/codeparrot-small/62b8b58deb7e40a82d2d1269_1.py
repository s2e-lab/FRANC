def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
		return interfaces.IInterface.providedBy(object)
	
	@classmethod
	def fromProperty(cls, prop):
		"""
		Return an `Interface` constructed with the given properties.
	
		If `prop` exists but isn't the interface property, a ValueError will be raised.
		"""
		o = cls()
		o.providedBy = prop
		return o
	
	@classmethod
	def fromClass(cls, object):
		"""
		Return the interfaces from the given object.
		
		You should not use directlyProvidedBy from inheriting classes
		as this will