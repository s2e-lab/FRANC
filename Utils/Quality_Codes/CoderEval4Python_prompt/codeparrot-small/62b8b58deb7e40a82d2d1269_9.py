def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	def __init__(self, interface):
		self.interface = interface
		
	def _check(self, name):
		if isinstance(name, zope.interface.Interface):
			return Equals(self.interface.implementedBy(name.parent()))
		if name is None:
			return False
		raise TypeError("Cannot supply an interface of type '%s'. "
						"Only interfaces of type 'zope.interface.Interface' are allowed.", name)
		
