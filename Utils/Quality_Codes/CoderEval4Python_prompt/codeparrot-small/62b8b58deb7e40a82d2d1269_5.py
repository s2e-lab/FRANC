def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	
	
	assert isinstance(object, IDeclaration), 'Object %r is not an'\
		      'interface' % object
	
	if isinstance(object, types.ModuleType):
		
		# get the object and its name
		obj = object.im_class
		name = None
		
		# get the interface name
		spec = obj
		if hasattr(spec, '__mro__'):
			# for this interface, we try to resolve their module path
			spec = spec.__mro__[1:]
		
		# get the module name
		moduleObjName = spec.im_class.__self__.__module