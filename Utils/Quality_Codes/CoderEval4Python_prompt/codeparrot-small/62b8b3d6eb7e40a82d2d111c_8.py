def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	if callable(sequence):
		return sequence(input_arg=sequence)
	elif isinstance(sequence, tuple):
		return tuple(sequence)
	else:
		assert isinstance(sequence, InstrArgs)
		return map(function, sequence)
