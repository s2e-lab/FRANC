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
	for o in orderings:
		prefs = set(o)
		if len(prefs) > 1:
			[pref] = prefs
			for i, o2 in enumerate(orderings[i+1:]):
				if pref in o2:
					try:
					    orderings[i+i]
					except:
					    raise ValueError("Cannot merge %r and %r" % (pref, o2))
					orderings[i+i] = orderings[i+i] + o2
					del order