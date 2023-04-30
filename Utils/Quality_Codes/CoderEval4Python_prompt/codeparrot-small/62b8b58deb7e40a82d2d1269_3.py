def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	
	def directlyProvidedByFactory(object):
		"""
		Return the interfaces directly provided by an interface

		The value returned is a new object created from the value returned by
		`zope.interface.interfaces.IDeclaration.construct(interface, factory=True)`
	
		All arguments provided by the `interface` argument must be provided on the
		interface.
		"""
		return (object.__eq__,)
	
	@classmethod
	def construct(cls, interface):
		"""
		Create a new interface from the given interface.
		
		:param interface: An interface to