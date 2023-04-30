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
	r = []
	for o in orderings:
		assert o, "Orderings must be non-empty"
		first1 = o[0].split('-')[-1]
		last1 = o[-1].split('-')[0]
		for i in xrange(1,len(o)):
			first2 = o[i].split('-')[-1]
			last2 = o[i-1].split('-')[0]
			assert first1 == first2
			assert last1 == last2
			r