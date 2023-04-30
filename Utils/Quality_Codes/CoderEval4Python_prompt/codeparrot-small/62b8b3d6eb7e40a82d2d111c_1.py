def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	
	if isinstance(sequence, (tuple,list)):
		new_sequence = [_normalize(seq) for seq in sequence]
		return [x if type(x)!= types.TupleType else x.normalize() for x in new_sequence]
	
	#TODO: get rid of "not in sequence"
	
	if not isinstance(sequence, Sequence):
		return [sequence]
	
	# remove invalid names from output, to avoid potential ambiguities
	if not output:
		output = []
	
	for i, a in enumerate(sequence):
		if not isinstance(