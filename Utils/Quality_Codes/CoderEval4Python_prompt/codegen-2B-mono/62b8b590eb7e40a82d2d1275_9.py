def _legacy_mergeOrderings(orderings):
	"""
	Merge multiple orderings so that within-ordering order is preserved
	
	Orderings are constrained in such a way that if an object appears
	in two or more orderings, then the suffix that begins with the
	object must be in both orderings.
	
	For example:
	
	>>> _mergeOrderings([
	... ['x', 'y', 'z'],
	... ['q', 'z'],
	... [1, 3, 5],
	... ['z']
	... ])
	['x', 'y', 'q', 1, 3, 5, 'z']
	"""
	# Check for errors
	if len(orderings) < 2:
		raise ValueError('Not enough orderings provided to merge')
	
	# Check that all arguments are comparable
	for i, ordering in enumerate(orderings[1:], 1):
		name1 = ordering[0]
		name2 = orderings[i-1][0]
		if name1 > name2:
			raise ValueError('Ordering {} after {}'.format(name1, name2))
	
	# Merge all but the last ordering
	result = [orderings