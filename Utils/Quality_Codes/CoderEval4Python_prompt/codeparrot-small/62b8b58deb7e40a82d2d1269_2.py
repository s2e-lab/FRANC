def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	interfaces = object.interfaces()
	
	implementedBy = interfaces.get('implementedBy', None) # pylint:disable=redefined-builtin
	providedBy = providedBy or interfaces.get('providedBy', None) # pylint:disable=redefined-builtin
	if implementedBy is None:
		implementedBy = implementedBy(object)
	else:
		implementedBy = implementedBy(object, providedBy)
	
	# Convert object to a class
	return implementedBy(object)

