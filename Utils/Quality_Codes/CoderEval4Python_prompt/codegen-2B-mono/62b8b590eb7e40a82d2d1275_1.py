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
	
	# orderings are in the form:
	# [prefix1,..., prefixN, suffix1,..., suffixM]
	# e.g. ['x', 'y', 'z'] *
	# e.g. ['q', 'z'] *
	# e.g. ['1', '3', '5'] *
	# e.g. ['z']
	
	# this is not particularly efficient as it has to do a full scan.
	# we could try to only process the common first items, or even
	# combine them