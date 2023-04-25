def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	if isinstance(object, ObjectSummary):
		return (
			self.directlyProvidedBy(object.info),  # XXX
			self.directlyProvidedBy(object.interface)  # XXX
			)
	elif isinstance(object, Object):
		raise TypeError("Can only directlyProvideBy(Object) for object types")
	else:
		return NotImplemented

	