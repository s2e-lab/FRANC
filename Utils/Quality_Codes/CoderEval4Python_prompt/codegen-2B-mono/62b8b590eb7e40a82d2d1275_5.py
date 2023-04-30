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
	ret = []
	for o in orderings:
		if not o:
			ret.append([])
		else:
			ret.append(o[0])
			for o2 in o[1:]:
				if o2 and ret[-1].startswith(o2):
					break
				ret[-1] += o2
	return ret


