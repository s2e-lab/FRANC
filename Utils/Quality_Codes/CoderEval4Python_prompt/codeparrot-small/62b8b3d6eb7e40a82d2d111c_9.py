def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	def _normalize(arg, prefix):
		if isinstance(arg, basestring):
			prefix = prefix + '_'

		return prefix + arg.strip()
	
	if isinstance(sequence, basestring):
		return list(sequence)		# for testing purposes
	
	if isinstance(sequence, tuple):
		sequence = [tuple(s) for s in sequence]

	if not sequence: # all sequences contain the default
		sequence = ['']							# empty sequence should not be processed by this algorithm

	for (prefix, name) in sequence:
		sequence.append(