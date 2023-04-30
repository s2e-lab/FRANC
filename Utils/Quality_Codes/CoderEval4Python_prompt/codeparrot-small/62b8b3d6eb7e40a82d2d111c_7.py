def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	
	if isinstance(sequence, list):
		return sequence
	
	elif isinstance(sequence, tuple):
		input_list = [ _normalizedecl(sequence[i], output) for i in sequence ]
		output_list = [ _normalizedecl(i, output) for i in sequence ]
		return input_list, output_list
	
	elif isinstance(sequence, set):
		input_list, output_list = sequence
		return [ _normalizedecl(i, output) for i in input_list ], output_list
	elif isinstance(sequence, list):
		return