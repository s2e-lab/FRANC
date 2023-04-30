def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	
	if not interface.__eq__(object):
		raise TypeError("not a valid interface")
	value = object.__class__.interfaces.get(object.__class__)()
	return value[object.interface.interface_name]

