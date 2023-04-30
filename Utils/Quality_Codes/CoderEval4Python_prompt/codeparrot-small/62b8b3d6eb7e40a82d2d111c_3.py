def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	
	if output is None:
		output = {}
	
	
	# Make lists comprehensive
	sequence = frozenset((str(x), x) for x in sequence)
	
	def expand(x):
		"""
		Expand interface arguments
		
		Arguments must be a type, and all interfaces in which they'll
		be expanded should be included.
		
		@type x: string
		@param x: interface argument
		
		@return: modified interface argument
		"""	
		
		for i, x in enumerate(sequence):
			if isinstance(x, Interface):
				if x.