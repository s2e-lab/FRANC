def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
		if output is None:
			output = []
		if type(sequence) == type(""):
			if not sequence:
				sequence = ""
		for i in sequence:
			output.extend(_normalizeargs(i, output))
	return output
