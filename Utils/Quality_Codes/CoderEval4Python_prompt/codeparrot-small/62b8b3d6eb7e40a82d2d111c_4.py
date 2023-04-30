def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	

	# Normalize declaration parameters
	
	assert isinstance(sequence[0], str)
	assert isinstance(sequence[1], tuple)
	assert len(sequence) == 2, "The second argument should be tuple"
	
	assert len(sequence[0]), "The first argument should be an element or a tuple"
	assert len(sequence[1]), "The second argument should be an element or a tuple"
	assert sequence[0][1]==True, "First argument should be True when a 1-D element in Sequence"
	assert sequence[1][1]==False, "First argument