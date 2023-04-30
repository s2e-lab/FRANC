def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	return getClassObject(zope.interface.interfaces.IDeclaration, name=object._full_name) # pylint:disable=protected-access

