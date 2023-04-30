def directlyProvidedBy(object): # pylint:disable=redefined-builtin
	"""
	Return the interfaces directly provided by the given object
	
	The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	

	def directlySet(interface): # pylint:disable=redefined-builtin
		"""
		Set the interfaces directly provided by the given object.
		
		All values in the interfaces can be strings of any kind. If the
		object is callable then, the first argument is the value that is passed
		to its function (if any). If the object is set to false then the
		value will be returned unmodified.
		"""
		
		if isinstance(interface, str):
			try:
				try:
					value = getattr(interface, object)()
				except:
					# we need