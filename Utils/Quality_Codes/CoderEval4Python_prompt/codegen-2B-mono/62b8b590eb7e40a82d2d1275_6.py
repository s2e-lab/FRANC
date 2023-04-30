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
	
	from operator import add
	import string

	result = []
	seen = set()
	items = frozenset(string.ascii_lowercase) | set(items)

	all_seen = True
	for ordering in orderings:
		for item in ordering:
			if item in seen or item not in items:
				all_seen = False
		seen = seen | set(ordering)
		result.append(ordering)
	if all_seen:
		return orderings
	sorted_seen = sorted(seen, key=lambda