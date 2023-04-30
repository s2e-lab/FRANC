def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	
	inputstr = " ".join(sequence)
	outputstr = " ".join(output)
	
	if list(reversed(inputstr)) not in VALID_OUTPUT_TYPES:
		raise Exception('Invalid output type (only %s)' % outputstr)
	
	if list(reversed(outputstr)) not in VALID_OUTPUT_TYPES:
		raise Exception('Invalid output type (%s)' % outputstr)
	
	if "decls" in inputstr:
		inputstr = " ".join(inputstr.split(" ",1))
	if "spec" in inputstr: