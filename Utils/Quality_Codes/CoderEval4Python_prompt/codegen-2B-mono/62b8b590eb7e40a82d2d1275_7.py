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
	
	orderingsByID = defaultdict(list)
	for o in orderings:
		orderingsByID[o[0]].append((len(orderingsByID), o))
	
	merged = []
	while orderingsByID:
		k, v = sorted(orderingsByID, key=lambda o: o[1])[0]
		merged += k
		del orderingsByID[k]
	
	if len(merged)!= len(orderings):
		raise RuntimeError("Error merging orderings")
